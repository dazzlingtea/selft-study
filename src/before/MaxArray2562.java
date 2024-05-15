package before;

import java.util.*;

public class MaxArray2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nArr = new int[9];
		
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = sc.nextInt();
		}
		int max = 0;
		for(int i: nArr) {
			if( i > max) max = i;
		}
		System.out.println(max);
		
		for(int i=0; i<nArr.length; i++) {
			if(max == nArr[i]) 
				System.out.println(i+1);
		}

	}

}
