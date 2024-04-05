package ClassAndObject;

import java.util.Scanner;

public class AreaOfCircle {
	float radius;

	public AreaOfCircle() {
		radius = 5;
	}

	public AreaOfCircle(float radius) {
		this.radius = radius;

	}

	public void calculate() {
		double area = (3.14 * radius * radius);
		System.out.println("Area of circle: " + area);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :  ");
		float radius = sc.nextFloat();
		AreaOfCircle a = new AreaOfCircle();
		a.calculate();
		AreaOfCircle b = new AreaOfCircle(radius);
		b.calculate();

	}

}
