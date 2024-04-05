package CodingChaleng;

import java.util.Scanner;

public class countAm {
	public int countAm(String str) {
		int count =0;
		String splitedStr[]=str.split(" ");
		
		for (int i=0; i<splitedStr.length;i++) {
			if(splitedStr[i].equalsIgnoreCase("am"))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		
		countAm a = new countAm();
		int res = a.countAm(str);
		System.out.println(res);

	}

}
