import java.util.Scanner;
import java.util.Stack;

// 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
// 따라서, 상수는 두 수중 큰 수인 437을 큰 수를 답함

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
