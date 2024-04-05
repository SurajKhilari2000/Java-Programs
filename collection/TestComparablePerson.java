package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparablePerson {
	void Comparable() {
    	   ArrayList<Person> lists = new  ArrayList<Person>();
    	   lists.add(new Person(10, "Aniket", 23));
    	   lists.add(new Person(20, "Amol", 22));
    	   lists.add(new Person(40, "Amit", 25));
    	   lists.add(new Person(30, "Anirudha", 20));
    	   lists.add(new Person(50, "Amruta", 23));
    	   System.out.println("**********Befor sorting *************");
   		for(Person pe:lists) {
   	
         System.out.println(pe);  
           }
   		System.out.println("********After sorting ***********");
   		Collections.sort(lists);
   		for(Person pe : lists) {
   			System.out.println(pe);
   		}
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestComparablePerson person= new TestComparablePerson();
person.Comparable();
	}

}
