package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if(!strList.contains(str)) {
                strList.add(str);
            }
        }
        Collections.sort(strList, (o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });
        strList.forEach(System.out::println);

    }
}
