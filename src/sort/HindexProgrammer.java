package sort;

import java.util.Arrays;
import java.util.Collections;

/*
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다.
어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때,
이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
 */
public class HindexProgrammer {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {10, 8, 5, 4, 3};
//        int[] citations = {25, 8, 5, 3, 3};
        int solution = new SolutionH().solution(citations);
        System.out.println(solution);
    }
}
class SolutionH {
    public int solution(int[] citations) {
        Integer[] wrappedCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(wrappedCitations, Collections.reverseOrder());

        int answer = 0;
        if(wrappedCitations[0] == 0) return 0;
        for (int i=0; i < wrappedCitations.length; i++) {
            if(wrappedCitations[i] < i+1) {
                break;
            }
            answer = i;
        }
        return answer+1;
    }
}
/* 형변환 하지 않고 오름차순으로 해결
    class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }
        return answer;
    }
}
 */