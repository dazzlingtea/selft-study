package before;

import java.util.*;
public class String10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int size = S.length();
		int[] alph = new int[26];
		
		for(int i=0; i<26; i++) {
			alph[i] = -1;
		}
		
		for(int i=0; i<size; i++) {
			int ch = (int)S.charAt(i);
			for(int j = 0; j<=25; j++) {
				if(ch == j+97) {
					if(alph[j]>-1) break;
					alph[j] = i;
				}
			}
		}
		for(int i: alph) {
			System.out.print(i+" ");
		}
		

	}

}
