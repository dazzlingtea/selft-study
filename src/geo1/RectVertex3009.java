package geo1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RectVertex3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> xSet = new HashSet<Integer>();
        Set<Integer> ySet = new HashSet<Integer>();
//        int[] xArr = new int[3];
//        int[] yArr = new int[3];
        int resultX = 0;
        int resultY = 0;

        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
//            xArr[i] = Integer.parseInt(st.nextToken());
//            yArr[i] = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            if(xSet.contains(a)) xSet.remove(a);

            int b = Integer.parseInt(st.nextToken());
            if(ySet.contains(b)) ySet.remove(b);
        }

    }
}
