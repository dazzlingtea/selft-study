package hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
    코니는 각 종류별로 최대 1가지 의상만 착용할 수 있습니다.
    예를 들어 위 예시의 경우 동그란 안경과 검정 선글라스를 동시에 착용할 수는 없습니다.
    착용한 의상의 일부가 겹치더라도, 다른 의상이 겹치지 않거나, 혹은 의상을 추가로 더 착용한 경우에는
    서로 다른 방법으로 옷을 착용한 것으로 계산합니다.
    코니는 하루에 최소 한 개의 의상은 입습니다.
    코니가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return


 */
public class Clothes {
    public static void main(String[] args) {
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}; // 5
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}; // 3

        int solution = new SolutionClothes().solution(clothes);
        System.out.println(solution);
    }
}
class SolutionClothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type,0) + 1);
        }
        Iterator<Integer> iter = map.values().iterator();
        int answer = 1;
        while (iter.hasNext()) {
            answer *= iter.next() + 1;
        }

        return answer - 1; // 아무것도 선택하지 않은 경우 제외
    }
}
/*
    class Solution {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }

 */