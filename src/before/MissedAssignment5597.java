package before;

import java.io.*;

public class MissedAssignment5597 {

	public static void main(String[] args) throws IOException {
		int Student[] = new int[30];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<28; i++) {
			int n = Integer.parseInt(bf.readLine());
			Student[n-1] = n;
		}
		for(int i=0; i<30; i++) {
			if(Student[i] == 0) bw.write(i+1 +"\n");
		}	
		bw.close();
	}

}
