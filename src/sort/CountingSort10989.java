package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingSort10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] cnt = new int[10001];

        for (int i = 0; i < n; i++) {
//            array[i] = Integer.parseInt(br.readLine());
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

//        Arrays.sort(array);
        for (int i = 0; i < 10001; i++) {
            while(cnt[i] > 0) {
//                sb.append(array[i]).append("\n");
                sb.append(cnt[i]).append("\n");
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
