import java.util.*;
public class String9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String st = sc.next();
			System.out.printf("%s%s\n",String.valueOf(st.charAt(0))
					, String.valueOf(st.charAt(st.length()-1)));
		}
		
	}

}
