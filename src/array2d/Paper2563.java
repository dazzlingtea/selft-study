package array2d;

import java.util.Scanner;

public class Paper2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] canvas = new int[100][100];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(canvas[x + j][y + k] == 0) {
                        count++;
                    }
                    canvas[x + j][y + k]++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }

}
