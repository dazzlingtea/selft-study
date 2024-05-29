package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] wbLine = {"WBWBWBWB", "BWBWBWBW"};
        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
             board[i] = br.readLine();
        }
        int wCount = 0;
        int bCount = 0;
        int minCount = n * m;
        int countMin = 0;
        int[] countArr = new int[(n-7)*(m-7)];
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        // i+k행에 따라 WBWB... BWBW... 각각 카운트
                        char c = board[i + k].charAt(j + l);
                        if(c != wbLine[k % 2].charAt(l)) wCount++;
                        else if(c != wbLine[(k+1) % 2].charAt(l))  bCount++;
                        //System.out.println(i+"-"+j+"-"+k+"-"+l + " wCount = " + wCount + " bCount = " + bCount);
                    }
                }
                minCount = Math.min(minCount, Math.min(wCount, bCount));
                //System.out.println(i+"-"+j+" minCount = " + minCount);
                // 8 * 8 카운트 후 초기화
                wCount = 0;
                bCount = 0;
            }
        }
        System.out.println(minCount);
    }
}
