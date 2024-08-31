package sort;

import java.util.Arrays;
import java.util.Comparator;

/*
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 */
public class MaxNumProgrammer {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
//        int[] numbers = {3, 30, 34, 5, 9};
        String solution = new SolutionMax().solution(numbers);
        System.out.println(solution);
    }
}
class SolutionMax {
    public String solution(int[] numbers) {
        // String 배열로 변환
        String[] strNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        // 커스텀 Comparator로 정렬
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        // 가장 큰 수가 0으로 시작하는 경우 "0"을 반환
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 결과 결합
        StringBuilder result = new StringBuilder();
        for (String number : strNumbers) {
            result.append(number);
        }
        return result.toString();
    }
}
/*
Arrays.sort(array, new Comparator<Integer>(){
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0) { // o1이 짝수이고 o2가 홀수인 경우
            return 1; // o1을 o2보다 뒤로 정렬
        } else if (o1 % 2 != 0 && o2 % 2 == 0) { // o1이 홀수이고 o2가 짝수인 경우
            return -1; // o1을 o2보다 앞으로 정렬
        } else { // 둘 다 홀수이거나 둘 다 짝수인 경우, 또는 둘 다 같은 경우
            return o1 - o2; // 기존의 오름차순 정렬을 유지
        }
    }
});
 */