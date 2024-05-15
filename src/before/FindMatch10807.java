package before;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindMatch10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] nArr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<nArr.length; i++) {
			if(st.hasMoreElements()) {
			nArr[i] = Integer.parseInt(st.nextToken());
			}
		}
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<nArr.length; i++) {
			if(nArr[i] == v) count++;
		}
		System.out.println(count);
	}

}
