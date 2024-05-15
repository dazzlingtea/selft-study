package before;

import java.io.*;
import java.util.*;

public class MinMax10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] numArr = new int[n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<numArr.length; i++) {
			if(st.hasMoreTokens()) {
			numArr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		int min = 1000001;
		int max = -1000001;
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i] < min) min = numArr[i];
			if(numArr[i] > max) max = numArr[i];
		}
		bw.write(min +" "+ max);
		bw.flush();
		bw.close();
		bf.close();
	}

}
