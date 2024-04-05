package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Person1> {

	



public class PersonComparator {
	void ComparatorDemo() {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person(1, "Rishi", 30));
		al.add(new Person(2, "Rishi", 22));
		al.add(new Person(3, "Rishi", 21));
		al.add(new Person(4, "Rishi", 25));

		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		for (Person st : al) {
			System.out.println(st);

		}

		System.out.println("-----------------------------------------------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonComparator personComparator = new PersonComparator();
		personComparator.ComparatorDemo();
	}

}

@Override
public int compare(Person1 p1, Person1 p2) {
	// TODO Auto-generated method stub
	if(p1.a)
}
