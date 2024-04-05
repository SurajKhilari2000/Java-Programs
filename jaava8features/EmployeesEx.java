package jaava8features;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class EmployeesEx {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Suraj", 20));
		list.add(new Employee(2, "Akash", 26));
		list.add(new Employee(3, "Ashu", 28));
		list.add(new Employee(4, "Pratik", 25));
		list.add(new Employee(5, "Pranali", 21));
		Collections.sort(list, (e1, e2) -> {
			return e1.name.compareTo(e2.name);

		});
		list.forEach(e -> System.out.println(e));

	}

}
