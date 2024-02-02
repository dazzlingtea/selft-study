import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ballbasket10810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] b = br.readLine().split(" ");
		int N = Integer.parseInt(b[0]);
		int M = Integer.parseInt(b[1]);
		int[] bArr = new int[N];
		
		for(int i=0; i<M; i++) {
			String[] condition = br.readLine().split(" ");
			int ibsk = Integer.parseInt(condition[0]);
			int jbsk = Integer.parseInt(condition[1]);
			int knum = Integer.parseInt(condition[2]);
			
			for(int j=ibsk-1; j<jbsk; j++) {
				bArr[j] = knum;
			}
		}
		for(int i : bArr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
