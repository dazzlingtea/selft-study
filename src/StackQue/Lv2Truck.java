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
        Queue<int[]> onBridge = new LinkedList<>();
        Queue<Integer> trucks = new LinkedList<>();
        for(int target : truck_weights){
            trucks.add(target);
        }

        int currWeight = 0;
        int time = 0;
        while(!trucks.isEmpty() || !onBridge.isEmpty()){
            if(!onBridge.isEmpty()
                    && onBridge.peek()[0] <= time
            ){
                int [] temp = onBridge.poll();
                currWeight -= temp[1];
            }

            if(!trucks.isEmpty()
                    && onBridge.size() + 1 <= bridge_length
                    && currWeight + trucks.peek() <= weight
            ){
                int temp = trucks.poll();
                currWeight += temp;
                onBridge.add(new int [] {time + bridge_length,temp});
            }
            time++;
        }
        return time;
    }
}

public class Lv2Truck {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        int answer = new Solution().solution(bridge_length, weight, truck_weights);
        System.out.println(answer);
    }
}
//import java.util.*;
//
//class Solution {
//    class Truck {
//        int weight;
//        int move;
//
//        public Truck(int weight) {
//            this.weight = weight;
//            this.move = 1;
//        }
//
//        public void moving() {
//            move++;
//        }
//    }
//
//    public int solution(int bridgeLength, int weight, int[] truckWeights) {
//        Queue<Truck> waitQ = new LinkedList<>();
//        Queue<Truck> moveQ = new LinkedList<>();
//
//        for (int t : truckWeights) {
//            waitQ.offer(new Truck(t));
//        }
//
//        int answer = 0;
//        int curWeight = 0;
//
//        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
//            answer++;
//
//            if (moveQ.isEmpty()) {
//                Truck t = waitQ.poll();
//                curWeight += t.weight;
//                moveQ.offer(t);
//                continue;
//            }
//
//            for (Truck t : moveQ) {
//                t.moving();
//            }
//
//            if (moveQ.peek().move > bridgeLength) {
//                Truck t = moveQ.poll();
//                curWeight -= t.weight;
//            }
//
//            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
//                Truck t = waitQ.poll();
//                curWeight += t.weight;
//                moveQ.offer(t);
//            }
//        }
//
//        return answer;
//    }
//}
