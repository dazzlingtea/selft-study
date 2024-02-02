import java.util.*;
import java.io.*;

public class LowNum10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String[] b1 = br1.readLine().split(" ");
		int N = Integer.parseInt(b1[0]);
		int X = Integer.parseInt(b1[1]);
		
//		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader는 한 번만 선언하고 그 뒤엔 대입해서 쓰기
		String[] b2 = br1.readLine().split(" ");
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(b2[i]);
			if(n < X) System.out.printf("%d ", n);
		}
		br1.close();
	}

}
