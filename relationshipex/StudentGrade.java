package relationshipex;

public class StudentGrade extends Student{
	String grad;
	public StudentGrade() {
		super();
		grad=" ";
		
	}public StudentGrade(int id, String name, MyDate dob, Address add, float phy, float chem, float maths){
		super(id, name, dob, add, phy, chem, maths);
		this.grad=grad;
		
	}@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(percent>90)
			grad="A+";
		else if  (percent>76)
			grad="A";
		else if(percent>60)
			grad="B+";
		else if (percent>50)
			grad="B";
		else
			grad = "Fail";
		
		
	}@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Grade:  "+grad);
	}

}
