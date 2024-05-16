package array2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vertical10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] board = new String[5][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j) +"";
            }
        }

        for (int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(board[j][i] != null) {
                    if(!board[j][i].equals("")) {
                        sb.append(board[j][i]);
                    }
                }
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}
