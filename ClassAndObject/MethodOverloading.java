package ClassAndObject;

public class MethodOverloading {
	public void area(float radius) {
		System.out.println("Area of Circle:  "+(3.14*radius*radius));
		
	}public int area(int length,int breadth) {
		return length *breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.area(10);
		int res = obj.area(20,27);
		System.out.println("Area of reactangle :  "+res); 

	}

}
