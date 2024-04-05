package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = new FileOutputStream("D:\\java\\abc.txt", true);
		String str = "Welcome to EduBridge ";
		byte bArr[] =str.getBytes();
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("File created");

	}

}
