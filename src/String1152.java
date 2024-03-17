import java.util.Scanner;

public class String1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		int result = 0;
		if(str.length() == 0) {
			System.out.println(result);
		} else {
			String[] arr = str.split(" ");
			result += arr.length;
			System.out.println(result);			
		}
	}

}
