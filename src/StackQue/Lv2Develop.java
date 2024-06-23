package StackQue;

import java.util.*;

public class Lv2Develop {
    public static void main(String[] args) {

        // 배포되어야 하는 순서대로 진도가 적힌 정수배열
//        int[] progress = {93, 30, 55};
        int[] progress = {95, 90, 99, 99, 80, 99};
        // 각 작업의 개발속도가 적힌 정수배열
//        int[] speeds = {1, 30, 5};
        int[] speeds = {1,1,1,1,1,1};
        int n = progress.length;

        // 각 배포마다 몇 개의 기능이 배포되는지를 return
        // 빨리 완성해도 앞순서가 완료해야 배포 가능 (앞순서와 같이 배로)
        // 7일째 2개, 9일째 1개
        // {95, 90, 99, 99, 80, 99} {1,1,1,1,1,1} => {1, 3, 2}
        // 5일째 1개, 10일째 3개, 20일 째 2개
//        Integer[] boxedBuff = Arrays.stream(progress).boxed().toArray(Integer[]::new);
//        Queue<Integer> features = new LinkedList<>(Arrays.asList(boxedBuff));
//        int[] complete = new int[n];
//        List<Integer> list = new ArrayList<>();


        List<Integer> list = new ArrayList<>();

        int days = 0;
        int index = 0; // 현재 배포할 작업의 인덱스

        while (index < n) {
            days++;
            int oneDayCount = 0;
            // 진행 상황 업데이트
            for (int i = index; i < n; i++) {
                progress[i] += speeds[i];
            }

            // 배포 가능 작업 수 확인
            while (index < n && progress[index] >= 100) {
                oneDayCount++;
                index++;
            }

            if (oneDayCount > 0) {
                list.add(oneDayCount);
            }
        }

        System.out.println(list);

//         미리 완료일을 구하여 큐 관리
//        class Solution {
//            public int[] solution(int[] progresses, int[] speeds) {
//                Queue<Integer> q = new LinkedList<>();
//                List<Integer> answerList = new ArrayList<>();
//
//                for (int i = 0; i < speeds.length; i++) {
//                    double remain = (100 - progresses[i]) / (double) speeds[i];
//                    int date = (int) Math.ceil(remain);
//
//                    if (!q.isEmpty() && q.peek() < date) {
//                        answerList.add(q.size());
//                        q.clear();
//                    }
//
//                    q.offer(date);
//                }
//
//                answerList.add(q.size());
//
//                int[] answer = new int[answerList.size()];
//
//                for (int i = 0; i < answer.length; i++) {
//                    answer[i] = answerList.get(i);
//                }
//
//                return answer;
//            }
//        }


    }
}
