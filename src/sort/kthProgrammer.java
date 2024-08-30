package sort;

import java.util.Arrays;

// k번째수 프로그래머스
public class kthProgrammer {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new Solution().solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0];
//            int end = commands[i][1];
//            int[] temp = new int[end-start+1];
//            System.arraycopy(array, start - 1, temp, 0, end - start + 1);

            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            // 부분 배열을 복사
            int[] temp = new int[end - start];
            for(int j = 0; j < temp.length; j++) {
                temp[j] = array[start + j];
            }

            // 퀵 정렬 적용
            quickSort(temp, 0, temp.length - 1);

            // k번째 값을 답으로 저장
            answer[i] = temp[k];
        }

        return answer;
    }

    // 퀵 정렬 함수
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // 퀵 정렬의 파티션 함수
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // 스왑
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 피벗을 올바른 위치로 이동
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}


 */