import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken(); //B진법의 값인 N
		int B = Integer.parseInt(st.nextToken()); //몇 진법인지
		br.close();
		
		int digit = 1; // 자릿수
		int sum = 0; // 출력할 숫자
		
		for(int i = N.length()-1 ; i >= 0; i--) {
			char C = N.charAt(i);
			
			if('A' <= C && C <= 'Z') {
				sum += (C - 'A' + 10) * digit;
			}else {
				sum += (C - '0') * digit;
			}
			digit *= B;
		}
		
		System.out.println(sum);

	}

}
