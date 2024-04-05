package exceptionhandling;

public class NestedTrayCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String s = null;
				System.out.println(s.length());

			} catch (NullPointerException e) {
				e.printStackTrace();

			}
			try {
				String s1 = "abc";
				System.out.println(Integer.parseInt(s1));

			} catch (NumberFormatException e) {
				e.printStackTrace();

			}
			System.out.println("Another lines ...");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of code ...");

	}

}
