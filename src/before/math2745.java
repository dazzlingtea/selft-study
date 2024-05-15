package before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken(); //B������ ���� N
		int B = Integer.parseInt(st.nextToken()); //�� ��������
		br.close();
		
		int digit = 1; // �ڸ���
		int sum = 0; // ����� ����
		
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
