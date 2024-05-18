package array2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixPlus2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] resultArr = new int[n][m];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2 * n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                resultArr[i % n][j] +=Integer.parseInt(st.nextToken());
                if(i >= n) {
                    sb.append(resultArr[i % n][j] + " ");
                }
            }
            if(i >= n) sb.append("\n");
        }
        System.out.println(sb);

    }
}
