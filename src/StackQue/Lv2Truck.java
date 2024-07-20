package StackQue;

import java.util.*;

/*
    제한 조건
    bridge_length는 1 이상 10,000 이하입니다.
    weight는 1 이상 10,000 이하입니다.
    truck_weights의 길이는 1 이상 10,000 이하입니다.
    모든 트럭의 무게는 1 이상 weight 이하입니다.
 */
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> afterBridge = new LinkedList<>();
        Queue<Integer> trucks = new LinkedList<>();
        for(int target : truck_weights){
            trucks.add(target);
        }

        int currWeight = 0;
        int time = 0;
        while(!trucks.isEmpty() || !afterBridge.isEmpty()){
            if(!afterBridge.isEmpty()
                    && afterBridge.peek()[0] <= time
            ){
                int [] temp = afterBridge.poll();
                currWeight -= temp[1];
            }

            if(!trucks.isEmpty()
                    && afterBridge.size() + 1 <= bridge_length
                    && currWeight + trucks.peek() <= weight
            ){
                int temp = trucks.poll();
                currWeight += temp;
                afterBridge.add(new int [] {time + bridge_length,temp});
            }
            time++;
        }
        return time;
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
