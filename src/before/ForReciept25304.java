package before;

import java.util.*;
public class ForReciept25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int cost = 0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			cost += a*b;
		}
		
		if(x == cost) System.out.println("Yes");
		else System.out.println("No");

	}

}
