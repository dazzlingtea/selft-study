package StackQue;

import java.util.*;

public class Lv2Process {
    public static void main(String[] args) {

        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        int result = 0;

        result = solution(priorities, location);
        System.out.println(result);

    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> process = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            // 앞뒤로 자유롭게 값을 꺼낼 수 있는 링크드 리스트에 입력값 저장
            process.add(priorities[i]);
        }

        while (!process.isEmpty()) {
            // 링크트 리스트의 앞쪽에서 갚을 꺼냄
            int tmp = process.poll();
            // 링크드 리스트에서 값이 빠져나왔는지 확인
            boolean outCheck = true;
            // 링크드 리스트 안에 더 큰 값이 존재한다면, 값을 다시 넣음
            for (int i = 0; i < process.size(); i++) {
                if (tmp < process.get(i)) {
                    process.add(tmp);
                    outCheck = false;
                    break;
                }
            }
            // 값이 빠져나왔다면, 실행순서를 한 번 늘리고 실행순서를 반환
            if (outCheck) {  answer++;  }
            if(location == 0) {
                return answer;
            } else {
                // 앞쪽에서 값이 빠져나갈때마다 한 자리씩 앞당겨지므로 location값 감소
                location--;

                if (location < 0)
                    location += process.size();

            }
        } ;

        return answer;
    }

}
