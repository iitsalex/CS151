package lab3;

import java.awt.Rectangle;

public class ArrayDumper {
	public static <T> void dumpArray(T[] a) {
		for (Object e : a) {
			System.out.println(e.toString());		}
	}

	public static void main(String[] args) {
		Object[] array = {new Rectangle(1,2,3,4), "hi-five", 1984, 0.55};
		dumpArray(array);
		Integer[] ar = {0,1,2,3,4,5};
		//int[] ar2 = {1,2,3,4};
		Rectangle[] recArray = {new Rectangle(5,6,7,8)};
		dumpArray(ar);
		//dumpArray(ar2);
		dumpArray(recArray);
		
	}
}