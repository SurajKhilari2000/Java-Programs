package relationshipex;

public class SalesPersson extends Employee {
	float sales, commission, totalSalary;

	public SalesPersson() {
		super();
		sales = 70;
	}

	public SalesPersson(int id, String name, MyDate dob, Address address, float perDay, float WorkingDays,
			float sales) {
		super(id, name, dob, address, perDay, WorkingDays);
		this.sales = sales;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if (sales > 95)
			commission = salary * 0.2f;
		else if (sales > 70)
			commission = salary * 0.15f;
		else if (sales > 60)
			commission = salary = 60;
		else
			commission = 0;
		totalSalary = salary + commission;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Sales: " + sales);
		System.out.println("Commission:  " + commission);
		System.out.println("Total salary: " + totalSalary);
	}

}
