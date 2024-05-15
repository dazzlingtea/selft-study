package before;

import java.util.Scanner;

class Shape {
	Shape next;
	void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape {
	void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	void draw() {
		System.out.println("Rect");
	}
}
class Tri extends Shape {
	void draw() {
		System.out.println("Tri");
	}
}


public class day8ShapeAppEx {
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape start = new Shape();
		Shape last = new Shape();
		Shape obj = new Shape();
		
		System.out.println("����� ������ �Է�");
		int nodes = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=nodes; i++) {
			System.out.println("���� �Է��ϼ���");
			String input = sc.nextLine();
			if(i == 1) {
				switch(input) {
				case "Line":
					start =  new Line();
					break;
				case "Rect":
					start = new Rect();
					break;
				case "Tri":
					start = new Tri();
					break;
				}
				last = start;
			} else {
				switch(input) {
				case "Line":
					obj = new Line();
					break;
				case "Rect":
					obj = new Rect();
					break;
				case "Tri":
					obj = new Tri();
					break;
				}
				last.next = obj;
				last = obj;
			}
		}
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Tri();
		last.next = obj;
		last = obj;
		
		Shape cursor = start;
		while(cursor != null) {
			cursor.draw();
			cursor = cursor.next;
		}
		
	}
}
