package factorprime;

import java.util.Scanner;

public class Factor2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < Math.floor(Math.sqrt(n)); i++) {
            if(n % i == 0){
                arr[i] = i;
            }
        }

    }
}
