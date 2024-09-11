package hash;
/*
    장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범,  노래는 고유 번호로 구분
    속한 노래가 많이 재생된 장르를 먼저 수록합니다.
    장르 내에서 많이 재생된 노래를 먼저 수록합니다.
    장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
    베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return
 */
public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        // pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록
        int[] solution = new SolutionAlbum().solution(genres, plays);
        System.out.println(solution);
    }
}
class SolutionAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }
}