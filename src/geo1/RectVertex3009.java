package geo1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RectVertex3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] coord1 = br.readLine().split(" ");
        String[] coord2 = br.readLine().split(" ");
        String[] coord3 = br.readLine().split(" ");

        String x, y;

        if(coord1[0].equals(coord2[0])) x = coord3[0];
        else if(coord1[0].equals(coord3[0])) x = coord2[0];
        else x = coord1[0];

        if(coord1[1].equals(coord2[1])) y = coord3[1];
        else if(coord1[1].equals(coord3[1])) y = coord2[1];
        else y = coord1[1];

        System.out.println(x + " " + y);

    }
}
