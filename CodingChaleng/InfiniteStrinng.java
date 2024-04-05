package CodingChaleng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteStrinng {
	
	public static boolean infString(String infStr , String toFind) {
		if(toFind.length()<infStr.length() && !infStr.contains(toFind)) {
			return false;
		}
		String replaceStr = infStr;
		while(replaceStr.length()<toFind.length()*3) {
			replaceStr +=infStr;
		}
		return replaceStr.contains(toFind);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String words[] = str.split(" ");
		String a= words[0];
		String b= words[1];
		if(infString(a, b)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
