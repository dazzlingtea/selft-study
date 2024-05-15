package before;

import java.util.*;

class Rectangle4 {
	int x, y, p, q;
	Rectangle4(int x, int y, int p, int q) {
			this.x = x;
			this.y = y;
			this.p = p;
			this.q = q;
	}
}

public class Rectangleabcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();
			int n5 = sc.nextInt();
			int n6 = sc.nextInt();
			int n7 = sc.nextInt();
			int n8 = sc.nextInt();
			
			Rectangle4 r1 = new Rectangle4(n1, n2, n3, n4);
			Rectangle4 r2 = new Rectangle4(n5, n6, n7, n8);
			
			if(r2.p < r1.x || r1.p < r2.x || r2.q < r1.y || r1.q <r2.y)
				System.out.println("d");
			else if(r1.x == r2.p || r1.p == r2.x) {
				if(r1.y == r2.q || r1.q == r2.y) System.out.println("c");
				else System.out.println("b");
			}
			else if(r1.y == r2.q || r1.q == r2.y) {
				System.out.println("b");
			}
			else System.out.println("a");
		}
	}
}
