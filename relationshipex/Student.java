package relationshipex;

public class Student extends Person {
	float phy, chem, maths, total, percent;

	public Student() {
		super();
		phy = 70;
		chem = 78;
		maths = 80;
	}

	public Student(int id, String name, MyDate dob, Address add, float phy, float chem, float maths) {
		super(id, name, dob, add);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}

	public void calculate() {
		total = phy + chem + maths;
		percent = total / 3;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Percentage: " + percent);
	}

}
