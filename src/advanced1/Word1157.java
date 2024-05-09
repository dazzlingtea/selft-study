package advanced1;

import java.util.*;
import java.util.Map.Entry;

public class Word1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toUpperCase();

        char[] str = s.toCharArray();

        Map<Character, Integer> wordMap = new HashMap<>();

        for (char c : str) {
            if(wordMap.containsKey(c)) {
                wordMap.put(c, wordMap.get(c) + 1);
            } else {
                wordMap.put(c, 1);
            }
        }

        char result = 0;
        int maxCount = 0;
        int maxValue = Collections.max(wordMap.values());

        for (Entry<Character, Integer> m : wordMap.entrySet()) {
            if(m.getValue() == maxValue) {
                if(maxCount == 0) {
                    result = m.getKey();
                } else {
                    result = '?';
                    break;
                }
                maxCount++;
            }
        }
        System.out.println(result);

        // 배열
        int[] count = new int[26];

        for (char c : str) {
            count[c - 'A']++;
        }
        char output = '?';
        int maxCount1 = 0;

        for (int i = 0; i < 26; i++) {
            if(count[i] > maxCount1) {
                output = (char) (i + 'A');
                maxCount1 = count[i];
            } else if (count[i] == maxCount1) {
                output = '?';
            }
        }
        System.out.println(output);

    }

}
