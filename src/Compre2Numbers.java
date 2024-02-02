import java.util.*;
public class Compre2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String comparison = "";
		
		if(A==B) comparison="==";
		else if(A>B) comparison=">";
		else comparison="<";
		System.out.println(comparison);
	}

}
