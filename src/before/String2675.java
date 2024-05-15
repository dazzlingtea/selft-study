package before;

import java.util.Scanner;

public class String2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNumber = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < caseNumber; i++) {
			
			int repeat = sc.nextInt();
			String str =sc.next(); 
			String output = "";
			
			sc.nextLine();
			
			for(int j=0; j < str.length(); j++) {
				for(int k=0; k < repeat; k++) {
					output += str.charAt(j);					
				}
			}
			
			System.out.println(output);	
		}
	}

}
