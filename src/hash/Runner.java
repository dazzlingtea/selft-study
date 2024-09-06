package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
    완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.
 */
public class Runner {
    public static void main(String[] args) {
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String solution = new SolutionRunner().solution(participant, completion);
        System.out.println(solution);
    }
}
class SolutionRunner {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(participant).forEach(p->map.put(p, map.getOrDefault(p, 0) + 1));
        Arrays.stream(completion).forEach(c->map.put(c, map.get(c) - 1));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return "";
    }
}
/* Fuction 찾아보기
    class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Long> participantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String name : completion) {

            Long value = participantMap.get(name) - 1L;

            if(value == 0L) {
                participantMap.remove(name);
            } else {
                participantMap.put(name, value);
            }
        }

        return participantMap.keySet().iterator().next();
    }
}
 */