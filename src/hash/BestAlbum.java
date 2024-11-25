package hash;

import java.util.*;
import java.util.stream.Collectors;

/*
    장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범, 노래는 고유 번호로 구분
    속한 노래가 많이 재생된 장르를 먼저 수록합니다.
    장르 내에서 많이 재생된 노래를 먼저 수록합니다.
    장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
    베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return
 */
public class BestAlbum {
    public static void main(String[] args) {
//        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        String[] genres = {"classic", "classic", "classic", "classic", "classic"};
        int[] plays = {500, 600, 150, 800, 2500};
        // pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록
        int[] solution = new SolutionAlbum().solution(genres, plays);
        System.out.println(Arrays.toString(solution));
    }
}
class SolutionAlbum {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생 수 계산
        Map<String,Integer> genreMap = new HashMap<>();
        // 개별 곡의 고유번호와 재생수 리스트
        Map<String,List<int[]>> genreSongs = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            genreMap.put(key, genreMap.getOrDefault(key, 0) + plays[i]);
            genreSongs.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }
        // 장르별 총 재생수를 기준으로 내림차순 정렬
        List<String> genreList = genreMap.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // 값 기준 내림차순 정렬
                .map(Map.Entry::getKey) // 정렬된 키 추출
                .collect(Collectors.toList());

        List<Integer> answerList = new ArrayList<>();
        for (String li : genreList) {
            List<int[]> ints = genreSongs.get(li);
            ints.stream()
                    .sorted(Comparator
                            .comparingInt((int[] o) -> o[1]) // 재생수 기준 내림차순
                            .reversed() // 내림차순 정렬
                            .thenComparingInt(o -> o[0])) // 재생수 같을 경우 고유번호 기준 오름차순
                    .limit(2)
                    .map(arr -> arr[0])
                    .forEach(answerList::add);
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42579/solution_groups?language=java