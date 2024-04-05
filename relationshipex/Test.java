package relationshipex;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Person person = new Person(); person.display();
		 * 
		 * Person p1 = new Person(1001, "Akshay", new MyDate(10, 10, 2000),new
		 * Address("Pimpari", "Khed", "Pune", "Maharashtra", "412406")); p1.display();
		 */
		/*
		 * Employee em = new Employee(); em.calculate(); em.display();
		 * 
		 * Employee em11 = new Employee(10, "Sachin", new MyDate(10, 10, 2000), new
		 * Address("Pimpari", "Khed", "Pune", "Maharashtra", "412406"), 28, 2500);
		 * em11.calculate(); em11.display();
		 */
		/*
		 * SalesPersson s1= new SalesPersson(); s1.calculate(); s1.display();
		 * 
		 * SalesPersson s2 = new SalesPersson(10, "Aakshy", new MyDate(10, 10, 2000),new
		 * Address("Pimpari", "Khed", "Pune", "Maharashtra", "412406"), 1230, 21, 90);
		 * s2.calculate(); s2.display();
		 */
		
		StudentGrade st1=new StudentGrade();
		st1.calculate();
		st1.display();
		
		StudentGrade st2 = new StudentGrade(101, "Amit", new MyDate(10, 10, 2001),new Address("Pimpari", "Khed", "Pune", "Maharashtra", "412406"), 80, 60, 90);
		st2.calculate();
		st2.display();
	}

}
