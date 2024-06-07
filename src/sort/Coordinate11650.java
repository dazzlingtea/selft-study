package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
        import java.util.stream.Collectors;

public class Coordinate11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Coordinate> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Coordinate(Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken())));
        }
        list = list.stream()
                .sorted(Comparator.comparing(Coordinate::getX)
                        .thenComparing(Coordinate::getY))
                .collect(Collectors.toList());

        list.forEach(c -> c.print());

    }
}
class Coordinate {
    int x;
    int y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX() { return this.x; }
    void setX(int x) { this.x = x; }
    int getY() { return this.y; }
    void setY(int y) { this.y = y; }

    void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.x).append(" ").append(this.y);
        System.out.println(sb);
    }
}