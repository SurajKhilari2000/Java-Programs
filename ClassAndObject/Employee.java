package ClassAndObject;

import java.util.Scanner;

public class Employee {
	String empName;
	int empCode;
	double basicSaslary,allowance,grossSalary,tax,netSalary;
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp code:  ");
		empCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter emp name: ");
		empName=sc.nextLine();
		System.out.println("Enter Basic  Salary:  ");
		basicSaslary=sc.nextDouble();
		
	}public void allow() {
		allowance=basicSaslary*0.55;
		
	}public void gross() {
		grossSalary = basicSaslary+allowance;
		
	}public void tax () {
		tax=grossSalary*0.12;
	}
	public void net() {
		netSalary=grossSalary-tax;
	}public void display() {
		System.out.println("Emp Code:  "+empCode);
		System.out.println("Emp Name:  "+empName);
		System.out.println("Basic Salary:  "+basicSaslary);
		System.out.println("Allowance :  "+allowance);
		System.out.println("Gross Salary :  "+grossSalary);
		System.out.println("Tax :  "+tax);
		System.out.println("Net Salaru :  "+netSalary);
	}
public static void main(String[] args) {
		Employee emp = new Employee();
		emp.accept();
		emp.allow();
		emp.gross();
	
		emp.tax();
		emp.net();
		emp.display();

}
}
