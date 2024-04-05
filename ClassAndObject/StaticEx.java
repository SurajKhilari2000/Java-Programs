package ClassAndObject;

public class StaticEx {
	int rollNumber;
	String name;
	static String instituteNmae="EduBridge Learning";
	public StaticEx() {
		
	}public StaticEx(int no,String ma){
		rollNumber=no;
		name  = ma;
		
	}
	public static void ChangeName(String changeName) {
		instituteNmae=changeName;
		
	}static{
		System.out.println("It is Called before main()");
	}{
		System.out.println("Instance block ");
	}
	public void Display() {
		System.out.println("Roll number:  "+rollNumber);
		System.out.println("Name:  "+name);
		System.out.println("Institute Name:  "+instituteNmae);
	}
		public static void main(String[] args) {
		ChangeName("EduBridge Learning Pvt Ltd");
		StaticEx student = new StaticEx(101,"Sakshi");
		student.Display();
		StaticEx student1=new StaticEx(102,"Suraj");
		student1.Display();
	}
	

}
