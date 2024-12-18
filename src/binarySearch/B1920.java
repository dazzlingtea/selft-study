package binarySearch;

/* https://www.acmicpc.net/problem/1920
    문제
    N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다.
    다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
    다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
    다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
    모든 정수의 범위는 -2^31 보다 크거나 같고 2^31보다 작다.

    출력
    M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int start; int end; boolean flag;
        for(int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            start = 0; end = N - 1; flag = false;
            while(start <= end) {
                int mid = (start + end) / 2;
                if(A[mid] > target) {
                    end = mid - 1;
                } else if (A[mid] < target) {
                    start = mid + 1;
                } else {
                    flag = true;
                    break;
                }
            }
            if(flag) System.out.println(1);
            else System.out.println(0);
        }

    }

}
/* 가독성
- 지역 scope로 메모리 사용은 다소 증가할 수 있으나 외부에서 변경 불가
for(int i = 0; i < M; i++) {
    int target = Integer.parseInt(st.nextToken());
    int start = 0;
    int end = A.length - 1;
    boolean find = false;
    while(start <= end) {
        int midIndex = (start + end) / 2;
        int midValue = A[midIndex];
        if(midValue > target) {
            end = midIndex - 1;
        } else if (midValue < target) {
            start = midIndex + 1;
        } else {
            find = true;
            break;
        }
    }
    if(find) System.out.println(1);
    else System.out.println(0);
}
 */