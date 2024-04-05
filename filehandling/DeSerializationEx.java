package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\java\\pqr.txt"));
		Student student = (Student) objectInputStream.readObject();
		System.out.println(student);
		objectInputStream.close();
	}

}
