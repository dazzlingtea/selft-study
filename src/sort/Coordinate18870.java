package sort;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Coordinate18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            set.add(x);
            arr[i] = x;
        }
        Object[] sorted = set.stream().sorted().toArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(Arrays.binarySearch(sorted,arr[i])).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
