package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitGenerator2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int digits = 1;
        int num = n;
        while(num / 10 > 0) {
            digits++;
            num = num / 10;
            System.out.println("num = " + num);
        }
        System.out.println("digits = " + digits);
        int minGenerator = n;
        for (int i = n-(digits*9); i <= n; i++) {
            int sum = i;
            int init = i;
            while(init / 10 > 0) {
                sum += init % 10;
                init = init / 10;
            }
            sum += init % 10;
            if(n == sum && minGenerator > i) minGenerator = i;
            System.out.println("i번째 :" + i + " sum: "+ sum);
        }
        if(minGenerator == n) minGenerator = 0;
        System.out.println(minGenerator);
    }
}
