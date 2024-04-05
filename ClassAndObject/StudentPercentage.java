package ClassAndObject;

import java.util.Scanner;

public class StudentPercentage {
	int id;
	String name;
	double math, phy, chem, percentage, total;

	public StudentPercentage() {
		id = 1;
		name = "Kiran";
		math = 60;
		phy = 90;
		chem = 80;

	}

	public StudentPercentage(int id, String name, double math, double phy, double chem) {
		this.id = id;
		this.name = name;
		this.math = math;
		this.phy = phy;
		this.chem = chem;

	}

	public void calculate() {
		total = math + phy + chem;
		percentage = total / 3;
		System.out.println("Student percentage :  " + percentage);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student id : ");
		int id = sc.nextInt();
		System.out.println("Student name :  ");
		String name = sc.next();
		System.out.println("Student Marks math,phy,chem");
		double math = sc.nextDouble();
		double phy = sc.nextDouble();
		double chem = sc.nextDouble();
		StudentPercentage a = new StudentPercentage();
		a.calculate();
		StudentPercentage b = new StudentPercentage(id, name, math, phy, chem);
		b.calculate();

	}

}
