package math1;
import java.util.Scanner;

public class Cent2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int cent = sc.nextInt();
            int quarter = (int)( cent / 25);
            int dime = (int) ((cent - quarter * 25) / 10);
            int nickel = (int) ((cent - quarter * 25 - dime * 10) / 5);
            int penny = (int) ((cent - quarter * 25 - dime * 10 - nickel * 5) / 1);
            System.out.printf("\n%d %d %d %d", quarter, dime, nickel, penny);
        }
    }
}
