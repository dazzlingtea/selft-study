package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        long n = Long.parseLong(s[0]);
        int b = Integer.parseInt(s[1]);

        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        // 나머지 1의 자리부터
        while(n > 0) {
            result.append(dChar.charAt((int) (n % b)));
            n /= b;
        }
        System.out.println(result.reverse());

        br.close();
    }
}
