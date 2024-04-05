package collection;

public class Person implements Comparable<Person> {

	private int personId;
	private String name;
	private int age;

	public Person(int personId, String name, int age) {

		this.personId = personId;
		this.name = name;
		this.setAge(age);
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + getAge() + "]";
	}

	public int compareTo(Person p) {
		if (personId > p.personId) {
			return 1;
		} else if (personId < p.personId) {
			return -1;
		} else
			return 0;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}