package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

}

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Akash", 20);
		Student s2 = new Student(2, "Pratik", 30);
		Student s3 = new Student(3, "Pramod", 23);
		Student s4 = new Student(4, "Raj", 25);
		Student s5 = new Student(5, "Rishi", 23);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		Iterator<Student> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}
}