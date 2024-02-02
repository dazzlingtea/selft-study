import java.io.*;
public class RemainArray3052 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int numArray[] = new int[10];
		int count = 0;
		boolean bl;
		
		for(int i=0; i<numArray.length; i++) {
			numArray[i] = Integer.parseInt(bf.readLine()) % 42;
		}
		
		for(int i=0; i<numArray.length; i++) {
			bl = false;
			for(int j=i+1; j<numArray.length; j++) {
				if(numArray[i] == numArray[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) count++;
		}
		System.out.println(count);
	}

}
