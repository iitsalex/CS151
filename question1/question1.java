import java.awt.Rectangle;

public class question1 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		String strTest = "yeehaw";
		classDumper dump = new classDumper();
		classDumper.dumpClass(rec);
		classDumper.dumpClass(strTest);
		classDumper.dumpClass(null);
		classDumper.dumpClass(dump);
	}
}
