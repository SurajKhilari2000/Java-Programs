package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer= new FileWriter("D:\\java\\xyz.txt", true);
		writer.write(" File Writer Example ");
		writer.close();

	}

}
