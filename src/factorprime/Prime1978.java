package factorprime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Prime1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> primes = new HashSet<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            if (x == 1) continue;
            for(int j = 2; j < x; j++) {
                if(x % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primes.add(x);
        }

        System.out.println(primes.size());
    }
}
