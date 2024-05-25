package timecomplex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigO24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aa = br.readLine().split(" ");
        int a1 = Integer.parseInt(aa[0]);
        int a0 = Integer.parseInt(aa[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int result;

        if(a1 * n0 + a0 <= c * n0 && a1 <= c) result = 1;
        else result = 0;

        System.out.println(result);
    }
}
