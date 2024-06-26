package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Median2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            arr[i] = n;
        }
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(sum / 5);
        System.out.println(arr[2]);


    }
}
