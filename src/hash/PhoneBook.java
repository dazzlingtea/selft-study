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
/* hashmap
    public class Solution {

    int bucketSize;
    List<Entry>[] bucket;

    public String solution(String[] participant, String[] completion) {
        bucketSize = (completion.length / 5)+1;
        bucket = new List[bucketSize];

        for (int i = 0; i < completion.length; i++) {
            Entry entry = get(completion[i]);
            entry.value += 1;
        }

        for (int i = 0; i < participant.length; i++) {
            Entry entry = get(participant[i]);
            if (entry != null && entry.value > 0) {
                entry.value -= 1;
            } else {
                return entry.key;
            }
        }
        throw new RuntimeException("error");
    }

    private Entry get(String s) {
        int idx = hash(s);
        List<Entry> list = bucket[idx];
        if (list == null) {
            list = new List<Entry>();
            Entry entry = new Entry(s, 0);
            list.add(entry);
            bucket[idx] = list;
            return entry;
        } else {
            Entry entry = list.get(s);
            if (entry == null) {
                entry = new Entry(s, 0);
                list.add(entry);
            }
            return entry;
        }
    }


    private int hash(String s) {
        int num = 0;
        for(int i=0; i<s.length(); i++) {
            num += s.codePointAt(i) * 31 + s.codePointAt(i);
        }
        return num % bucketSize;
    }

    class Entry {
        String key;
        int value;

        public Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class List<T extends Entry> {
        Node head;

        public void add(T entry) {
            Node nn = new Node(entry, null);

            if (head == null) {
                head = nn;
            } else {
                Node last = head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = nn;
            }
        }

        public <T extends Entry> T get(String s) {
            Node node = head;
            while (node != null) {
                if (node.data.key.equals(s)) {
                    return (T) node.data;
                }
                node = node.next;
            }

            return null;
        }

        class Node<T extends Entry> {
            T data;
            Node next;

            public Node(T data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
    }

    public static void main(String[] args) {
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        Solution s = new Solution();
        String answer = s.solution(p, c);
        System.out.println(answer);
    }

}
 */