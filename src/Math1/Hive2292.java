package Math1;

import java.util.Scanner;

public class Hive2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double x = (double) (n - 1) / 6;
        double v = (Math.sqrt(8 * x + 1) - 1) / 2;

        int room = 1 + (int) Math.ceil((Math.sqrt(8 * x) - 1) / 2);

        System.out.println(room);

    }
}
