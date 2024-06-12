package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Age10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Judge> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Judge(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        list.stream()
                .sorted(Comparator.comparing(j -> j.age))
                .forEach(j -> {
                    System.out.println(j.age +" "+j.name);
                });
    }

    static class Judge {
        private int age;
        private String name;

        Judge(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
