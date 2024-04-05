package exceptionhandling;

public class Student {
	static void toFindRollNumber(int rollNumber) throws StudentNotFoundExException {
		if (rollNumber >=1 && rollNumber <=20)
			System.out.println("Student Found ");
		else 
			throw new StudentNotFoundExException("Student not Found: "+rollNumber);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			toFindRollNumber(25);
		} catch (StudentNotFoundExException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of code ...");

	}

}
