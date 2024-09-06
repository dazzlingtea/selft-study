package hash;

import java.util.HashSet;
import java.util.Set;

/*
    최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
    N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때,
    N/2마리의 폰켓몬을 선택하는 방법 중,
    가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return
 */
public class Poncketmon {
    public static void main(String[] args) {
//        int[] nums = {3,1,2,3}; // 2
//        int[] nums = {3,3,3,2,2,4}; // 3
//        int[] nums = {3,3,3,2,2,2}; // 2
//        int[] nums = {3, 4}; // 1
        int[] nums = {3, 4, 3, 4, 2, 2, 2, 1, 1, 1}; // 4
        int solution = new SolutionPoncketmon().solution(nums);
        System.out.println(solution);
    }
}
class SolutionPoncketmon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), (int) (nums.length * 0.5));
    }
}