package factorprime;

import java.util.*;
import java.util.stream.Collectors;

public class Factor2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                factors.add(i);
                if(i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        if(factors.size() < k) {
            System.out.println(0);
        } else {
            Collections.sort(factors);
            System.out.println(factors.get(k-1));
        }
    }
}
