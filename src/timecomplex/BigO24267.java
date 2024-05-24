package timecomplex;

import java.util.Scanner;

public class BigO24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        if(n <= 2) {
            System.out.println(0);
        } else {
            for (long i = 1; i <= n - 2; i++) {
                sum += (long) (i * (i + 1) / 2L);
            }
            System.out.println(sum);
        }

        /*
            nC3 = n * (n-1) * (n-2) / 6
            7C3 = 7! / 4!3! = 7 * 6 * 5 * 4 *... / ...* (3*2*1)
            3이라 분모의 6은 고정
         */

        System.out.println(3);

    }
}
