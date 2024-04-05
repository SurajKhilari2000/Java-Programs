package ClassAndObject;

public class SimpleInterest {
	double principalAmt,rate,years;
	public  SimpleInterest() {
		principalAmt=25000;
		rate = 6.7;
		years=2;
	}public SimpleInterest(double principalAmt , double rate,double years){
		this.principalAmt=principalAmt;
		this.rate=rate;
		this.years=years;
		
	}public void calcculate(){
		double interest=principalAmt*rate*years/100;
		System.out.println("Simple Interst: "+interest);
	}public static void main(String[] args) {
		SimpleInterest obj = new SimpleInterest();
		obj.calcculate();
		SimpleInterest obj1 = new SimpleInterest(65000, 7.2, 3);
		obj1.calcculate();
	}

}
