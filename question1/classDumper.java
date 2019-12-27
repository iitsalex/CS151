
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class classDumper {

	private static final int tabSize = 4;

	public static void dumpClass(Object argClass) {

		// Establishing class of object
		Class objClass;
		if (argClass != null)
			objClass = argClass.getClass();
		else {
			System.out.println("Null class passed \n\n\n");
			return;
		}

		// Establishing package of class
		Package classPackage = objClass.getPackage();
		if (classPackage != null)
			System.out.println("package " + classPackage.getName() + ";\n");

		// Simple name of class
		String className = objClass.getSimpleName();

		// Modifiers of class (if any)
		String modifiers = Modifier.toString(objClass.getModifiers());

		modifiers += " ";

		// Initialize full name
		String nameAndModifiers;

		// Checking interface type
		if (objClass.isInterface())
			nameAndModifiers = modifiers + className;
		else
			nameAndModifiers = modifiers + "class " + className;

		// check if super class is valid and check if = original class
		if (objClass.getSuperclass() != null)
			if (objClass.getSuperclass() != Object.class) {
				nameAndModifiers = nameAndModifiers + " extends " + objClass.getSuperclass().getName();
			} else {
				// System.out.println("None/Null superclass");
			}

		System.out.println(nameAndModifiers);

		// Get list of interfaces/extensions
		Class[] interfaces = objClass.getInterfaces();
		if (interfaces.length != 0) {
			if (objClass.isInterface())
				System.out.print("extends ");
			else
				System.out.print("implements ");

			for (int i = 0; i < interfaces.length - 1; i++)
				System.out.print(interfaces[i].getName() + ", ");
			System.out.println(interfaces[interfaces.length - 1].getName());
		}

		System.out.println("{");

		// Get list of constructors
		Constructor[] constructorList = objClass.getDeclaredConstructors();
		if (constructorList.length > 0) {
			for (Constructor ct : constructorList) {
				String constructorName = ct.toString();

				modifiers = Modifier.toString(ct.getModifiers());
				modifiers += " ";

				String listOfParams = constructorName.substring(constructorName.indexOf("("));

				printIndent(1, modifiers + className + listOfParams + ";");
			}
		}

		// Methods
		Method[] methods = objClass.getMethods();

		System.out.println();

		// Get method names, params, return types
		for (Method m : methods) {
			String methodString = m.toString();

			modifiers = Modifier.toString(m.getModifiers());

			modifiers += " ";

			String returnType = m.getReturnType().getName();

			String listOfParams = methodString.substring(methodString.indexOf("("));

			String nameOfMethod = m.getName();

			printIndent(1, modifiers + returnType + " " + nameOfMethod + listOfParams + ";");
		}

		// Fields
		Field[] fields = objClass.getDeclaredFields();

		System.out.println();

		// Get field names, types
		for (Field f : fields) {
			String fString = f.toString();

			modifiers = Modifier.toString(f.getModifiers());
			modifiers += " ";

			String fieldType = f.getType().getName();

			String nameOfField = f.getName();

			printIndent(1, modifiers + fieldType + " " + nameOfField + ";");
		}

		System.out.println("}");

		// For multiple prints to console
		System.out.println("\n\n\n");
	}

	private static void printIndent(int amount, String str) {
		String spaces = new String(new char[tabSize * amount]).replace('\0', ' ');
		System.out.println(spaces + str);

	}

}