package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Sort1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] nArr = br.readLine().toCharArray();
//        Arrays.sort(nArr);
        String[] nArr = br.readLine().split("");
        Arrays.sort(nArr, Collections.reverseOrder());

//        StringBuilder sb = new StringBuilder(String.valueOf(nArr)).reverse();
        StringBuilder sb = new StringBuilder();
        for (String s : nArr) {
            sb.append(s);
        }
        System.out.println(sb);
    }
}
