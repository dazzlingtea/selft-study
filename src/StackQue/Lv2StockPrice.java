package StackQue;

/*
    초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
    가격이 떨어지지 않은 기간은 몇 초인지를 return

    제한사항
    prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
    prices의 길이는 2 이상 100,000 이하입니다.
 */

import java.util.Arrays;
import java.util.Stack;

public class Lv2StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] solution = new Solution2().solution(prices);
        System.out.println(Arrays.toString(solution));
    }
}

class Solution2 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        // 결과 배열 초기화 (모든 요소가 0으로 설정됨)
        int[] result = new int[prices.length];
        // 가격 인덱스를 담을 스택 초기화
        Stack<Integer> stack = new Stack<>();

        // 가격 배열을 순회
        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고, 스택의 맨 위 인덱스의 가격이 현재 가격보다 클 때
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                // 가격이 떨어진 시점까지의 시간을 계산하여 결과 배열에 저장
                result[index] = i - index;
            }
            // 현재 인덱스를 스택에 추가
            stack.push(i);
        }

        // 스택에 남아있는 인덱스 처리 (끝까지 가격이 떨어지지 않은 경우)
        while (!stack.isEmpty()) {
            int index = stack.pop();
            // 배열의 끝까지 가격이 유지된 시간 저장
            result[index] = prices.length - 1 - index;
        }

        return answer;
    }
}