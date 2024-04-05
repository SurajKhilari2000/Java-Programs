package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else
			return -1;
	}

}

class nameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);

	}

}

public class TestComparator {

	void ComparatorDemo() {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(40, 1, "Teena"));
		al.add(new Student(23, 2, "Leena"));
		al.add(new Student(24, 3, "Reena"));
		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		for (Student st : al) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);

		}
		System.out.println("------------------------------------------------------------");
		Collections.sort(al, new nameComparator());
		for (Student st : al) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);

		}
		System.out.println("-----------------------------------------------------------");

	}

	public static void main(String[] args) {
		TestComparator test = new TestComparator();
		test.ComparatorDemo();

	}

}
