package ClassAndObject;

import java.util.Scanner;

public class AreaOfTrangle {
	double height,base;
	public AreaOfTrangle () {
		height=50;
		base=30;
	}public AreaOfTrangle(double height,double base){
		this.height=height;
		this.base=base;
		
		
	}public void calculate() {
		double area=0.5*height*base;
		System.out.println("Area of Trangle: "+area);
		
	}public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter height and base ");
		double h=sc.nextDouble();
		double l=sc.nextDouble();
		AreaOfTrangle a = new AreaOfTrangle();
		a.calculate();
		AreaOfTrangle b = new AreaOfTrangle(h, l);
		b.calculate();
		
	}

}
