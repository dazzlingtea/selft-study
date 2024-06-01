package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        if(n % 5 == 0) {
            result = n / 5;
        } else if(n % 5 == 3) {
            result = n / 5 + 1;
        } else {
            result = factors(n);
        }
        System.out.println(result);
    }
    static int factors(int n) {
        int min = Integer.MAX_VALUE;
        for (int i = n/5; i >= 0; i--) {
            for (int j = 0; j <= n/3; j++) {
                if(5*i + 3*j == n) {
                    min = Math.min(min, i+j);
                }
            }
        }
        return min != Integer.MAX_VALUE ? min : -1 ;
    }
    // 이렇게 풀었지만 5의 몫이 최대일 때 봉투 최소
    // n%5==0, ==1, ... 나머지별로 풀 수 있음
}
