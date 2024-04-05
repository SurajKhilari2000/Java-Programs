package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputStream = new FileInputStream("D:\\java\\abc.txt");
		int i = 0;
		while ((i = inputStream.read()) != -1) {
			System.out.print((char) i);
		}
		inputStream.close();
	}

}
