import java.util.Scanner;

public class String11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		String num = sc.next();
		int result = 0;
		
		for(int i=0; i<nums; i++) {
			int n = Integer.parseInt(""+num.charAt(i));
			result += n;
		}
		System.out.println(result);
	}

}
