package ClassAndObject;

public class EmployeUsingConsstructor {
	String empName;
	int empCode;
	double basicSaslary, allowance, grossSalary, tax, netSalary;

	public EmployeUsingConsstructor() {
		empCode = 50;
		empName = "Suraj";
		basicSaslary = 30000;

	}

	public EmployeUsingConsstructor(int empCode, String empName, double basicsSaalary) {
		this.empCode = empCode;
		this.empName = empName;
		this.basicSaslary = basicsSaalary;

	}

	public void calculation() {
		System.err.println("Emp Code: " + empCode);
		System.out.println("Emp nmae :  " + empName);
		System.out.println("Basics salary:  " + basicSaslary);
		allowance = basicSaslary * 0.55;
		System.out.println("Aallowance : " + allowance);
		grossSalary = basicSaslary + allowance;
		System.out.println("gross Salary :  " + grossSalary);
		tax = grossSalary * 0.12;
		System.out.println("Tax : " + tax);
		netSalary = grossSalary - tax;
		System.out.println("Net Salary:  "+netSalary);
	}

	public static void main(String[] args) {
		EmployeUsingConsstructor em = new EmployeUsingConsstructor();
		em.calculation();
		EmployeUsingConsstructor en = new EmployeUsingConsstructor(50, "Rushi", 60000);
		en.calculation();
	}

}
