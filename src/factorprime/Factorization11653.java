package factorprime;

import java.io.*;
import java.util.*;


public class Factorization11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) return;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                n = n / i;
                while (n % i == 0) {
                    factors.add(i);
                    n = n / i;
                }
            }
        }
        factors.forEach(System.out::println);
    }
}
