package CodingChaleng;

import java.util.Scanner;

public class SecondSmallest {
	public int getSecondSmallest(int a[]) {
		int temp = 0, res = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		res = a[1];
		return res;
	}

	public static void main(String[] args) {
		int a[] = { 23, 45, 32, 22, 20, 96 };
		SecondSmallest hw = new SecondSmallest();
		int ans = hw.getSecondSmallest(a);
		System.out.println(ans);
	}

}
