package StackQue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    제한 조건
    bridge_length는 1 이상 10,000 이하입니다.
    weight는 1 이상 10,000 이하입니다.
    truck_weights의 길이는 1 이상 10,000 이하입니다.
    모든 트럭의 무게는 1 이상 weight 이하입니다.
 */
class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int passingWeight = 0;
        int answer = 0;
        Queue<Integer[]> queue = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            int truckWeight = truck_weights[i];
            if (queue.size() < bridge_length
                    && passingWeight + truckWeight <= weight
            ) {
                queue.add(truckWeight);
                passingWeight += truckWeight;
            } else {
                answer++;
                queue.poll();
            }

        }
        return answer;
    }

}

public class Lv2Truck {
    public static void main(String[] args) {
        int bridge_length = 0;
        int weight = 0;
        int[] truck_weights = {};

        int answer = new Solution().solution(bridge_length, weight, truck_weights);
        System.out.println(answer);
    }
}
