package collection;

import java.util.LinkedList;

public class LinkedlisteEx {
public static void main(String[] args) {
	LinkedList<String> linkedList= new LinkedList<String>();
	linkedList.add("Apple");
	linkedList.add("Mango");
	linkedList.add("Banana");
	linkedList.add(1,"Grapes");
	linkedList.add("Apple");
	linkedList.add(null);
	for (String string :linkedList) {
		System.out.println(string);
	}
	
	LinkedList<String> linkedList2= new LinkedList<String>();
	linkedList2.add("Jasmin");
	linkedList2.add("Lilly");
	
	linkedList.addAll(linkedList2);
	System.out.println("Adding list2 in first :\n"+linkedList);

}
}
