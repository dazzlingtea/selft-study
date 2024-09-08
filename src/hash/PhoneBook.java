package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/42577
    전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
    어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return
    구조대 전화번호는 영석이의 전화번호의 접두사입니다.
    구조대 : 119
    박준영 : 97 674 223
    지영석 : 11 9552 4421

 */
public class PhoneBook {
    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"}; // false
//        String[] phone_book = {"123","456","789"}; // true
//        String[] phone_book = {"12","123","1235","567","88"}; // false
        String[] phone_book = { "123", "12345", "1245", "1243", "12"}; // false

        boolean solution = new SolutionPhoneBook().solution(phone_book);
        System.out.println(solution);
    }
}
class SolutionPhoneBook {
    public boolean solution(String[] phone_book) {
        if (phone_book.length == 1) return true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            String s = phone_book[i];
            if (phone_book[i + 1].startsWith(s)) {
                return false;
            }
        }
        return true;
    }
}