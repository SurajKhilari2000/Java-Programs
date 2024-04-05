package relationshipex;

public class Employee extends Person{
	float perDay,WorkingDays,salary;
	public Employee() {
		super();
		perDay=1200;
		WorkingDays=18;
	}
	public Employee(int id,String name,MyDate dob,Address address,	float perDay,float WorkingDays) {
		super(id, name, dob, address);
		this.perDay=perDay;
		this.WorkingDays=WorkingDays;
		
		
	}
	public void calculate() {
		salary=WorkingDays*perDay;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("salary:  "+salary);
	}
	

}
