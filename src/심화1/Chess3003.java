package 심화1;

import java.util.Scanner;

public class Chess3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8};
        String[] arrInput = sc.nextLine().split(" ");

        int[] arrAnswer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrAnswer[i] = arr[i] - Integer.parseInt(arrInput[i]);
        }
        for (int i : arrAnswer) {
            System.out.print(i + " ");
        }

    }
}
