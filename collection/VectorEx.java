package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.addElement("Jasmin");
		vector.add("Rose");
		vector.add("Lilly");
		vector.add("Mogra");
		vector.add("Rose");
		vector.add(null);

		Enumeration<String> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
