package abstraction;

import java.util.Scanner;

abstract class Bank {

	public abstract double getRateOfInterest();

}

class Axis extends Bank {

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.5;
	}

	

}

class Sbi extends Bank {

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.2;
	}


}

public class TestBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double principalAmount, years, rateAxis, rateSib;
		System.out.println("Enter principal amount and years: ");
		principalAmount = sc.nextDouble();
		years = sc.nextDouble();

		Bank bank;

		bank = new Sbi();
		rateSib = bank.getRateOfInterest();

		bank = new Axis();
		rateAxis = bank.getRateOfInterest();

		double simpleInterestSbi = principalAmount *years * rateSib / 100;

		double simpleInterestAxis = principalAmount * years * rateAxis / 100;

		System.out.println("Simple interest of SBI:  " + simpleInterestSbi);
		System.out.println("Simple interest of Axis:  " + simpleInterestAxis);

	}

}
