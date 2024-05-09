package advanced1;

import java.util.Scanner;

public class Palindrome10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int half = (int) Math.floor(word.length() / 2);

        for (int i = 0; i < half; i++) {
            if(word.charAt(i) != word.charAt(word.length() -i -1)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);

    }
}
