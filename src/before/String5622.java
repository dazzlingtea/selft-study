package before;

import java.util.Scanner;

public class String5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int[] dial = new int[]{2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		int result = 0;
		for(char i : arr) {
			byte ascii = (byte)i;
			int num = dial[ascii - 65];
			result += num + 1;		
		}
		System.out.println(result);
	}

}
