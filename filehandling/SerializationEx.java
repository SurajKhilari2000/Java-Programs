package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student  implements Serializable{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
public class SerializationEx {

	public static void main(String[] args) throws IOException {

		Student student= new Student(100, "Sumit");
		FileOutputStream objStream = new FileOutputStream("D:\\java\\pqr.txt");
		ObjectOutputStream objectOutputStream =new ObjectOutputStream(objStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.flush();
		System.out.println("Converted to byte stream");
	}

}
