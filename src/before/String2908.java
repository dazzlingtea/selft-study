package before;

import java.util.Scanner;
import java.util.Stack;

// 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
// ����, ����� �� ���� ū ���� 437�� ū ���� ����

public class String2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = new String[2];
		numbers[0] = sc.next();
		numbers[1] = sc.next();
		
		for(int i=0; i < numbers.length ; i++) {
			String str2 = "";
			String[] str = numbers[i].split("");
			Stack<String> stack = new Stack<>();
			for(int j=0; j < str.length; j++) {
				stack.push(str[j]);	
			}
			for(int j=0; j < str.length; j++) {
				str2 += stack.pop();	
			}
			numbers[i] = str2;
		}
		
		if(Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1])) {
			System.out.println(numbers[0]);
		} else {
			System.out.println(numbers[1]);
		}
		
	}

}
