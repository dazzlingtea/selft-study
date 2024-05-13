package advanced1;

import java.util.Scanner;

public class Croatia2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = sc.nextLine();
        String s = str;
        for (String a : array) {
            s = s.replaceAll(a, "*");
        }
        System.out.println(s.length());
    }
}
