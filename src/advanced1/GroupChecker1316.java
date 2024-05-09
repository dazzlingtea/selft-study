package advanced1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GroupChecker1316 {
    
    private static boolean isGroupWord(String str) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(i != 0 && str.charAt(i-1) == str.charAt(i)) {
            } else {
                boolean addSuccess = charSet.add(str.charAt(i));
                if(!addSuccess) { return false; }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = Integer.parseInt(sc.nextLine());
        while(n > 0) {
            String s = sc.nextLine();
            if(isGroupWord(s)) {
                count++;
            }
            n--;
        }
        System.out.println(count);
    }
}
