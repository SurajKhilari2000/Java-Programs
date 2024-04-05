package exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Case1 : where exception doesn't occur");
		try {
			int a = 10 / 5;
			System.out.println("div : " + a);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Case1: always executes");
		}
		System.out.println("Case2 : where exception occur and handles");
		try {
			int a = 10 / 0;
			System.out.println("Div : " + a);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Case2: always executes");

		}
		System.out.println("Case3 : where exception occur and not handled");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Case3: always executes");

		}

		System.out.println("rest of code....");

	}

}
