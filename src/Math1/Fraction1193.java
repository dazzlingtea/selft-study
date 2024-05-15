package Math1;

import java.util.Scanner;

public class Fraction1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // n(n+1)/2 ≤ x < (n+1)(n+2)/2 인 n 찾기 (근의 공식)
        int n = (int) Math.ceil((Math.sqrt(8 * x + 1) - 1) / 2);

//        // n(n+1)/2 -> n의 제곱과 2x를 비교
//        int n = (int) Math.sqrt(2 * x);
//
//        // 대각선 n 찾기
//        while(true) {
//            // n(n+1) = 인 경우 n-1
//            if(n * (n+1) < 2 * x && x * 2 <= (n+1) * (n+2)) {
//                n += 1;
//                break;
//            }
//            n -= 1;
//        }
        // 대각선에서의 위치
        int nth = x - n * (n - 1) / 2;

//        int zig = (n - nth + 1);
//        int zag = (1 + nth - 1);
//
//        System.out.println(n % 2 == 1 ? zig + "/" + zag : zag + "/" + zig);

        // 분수 계산
        int numerator = (n % 2 == 0) ? nth : n - nth + 1; // 분자
        int denominator = (n % 2 == 0) ? n - nth + 1 : nth; // 분모

        // 결과 출력
        System.out.println(numerator + "/" + denominator);
    }
}
