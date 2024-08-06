package StackQue;

/*
    초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
    가격이 떨어지지 않은 기간은 몇 초인지를 return

    제한사항
    prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
    prices의 길이는 2 이상 100,000 이하입니다.
 */

import java.util.Arrays;

public class Lv2StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 30};
        int[] solution = new Solution2().solution(prices);
        System.out.println(Arrays.toString(solution));
    }
}

class Solution2 {
    public int[] solution(int[] prices) {
        int[] answer = {};

        for (int i=1; i<prices.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(prices[i]>prices[j]) {
                    answer[i-1]++;
                }
            }
        }

        return answer;
    }
}