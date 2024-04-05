package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLIstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add("Raju");
		list1.add(56.78);
		list1.add(null);
		list1.add("Raju");
		System.out.println("Non Generic list : " + list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Mogrya");
		list2.add("Lotus");
		list2.add("Rose");
		//list2.add(null);
		System.out.println("Generic list : " + list2);

		System.out.println("Iterating list using Iterator Interface : ");
		Iterator<String> iterator = list2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("iterating list using for each lloop : ");
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("After Sorting : ");
		Collections.sort(list2);
		for (String string : list2) {
			System.out.println(string);
		}

	}

}
