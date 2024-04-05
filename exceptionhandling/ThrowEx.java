package exceptionhandling;

public class ThrowEx {
	static void checkAge(int age) {
		if(age>=18) {
			System.out.println("Welcome to vote");
		}
		else {
			throw new ArithmeticException("Age is not valid");
		}
	}public static void main(String[] args) {
		try {
			checkAge(2);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code");
	}

}
