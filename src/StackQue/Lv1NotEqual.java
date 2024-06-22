package StackQue;

//https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Lv1NotEqual {
    public static void main(String[] args) {

//        int[] arr = {4, 4, 4, 3, 3};
        int[] arr = {1, 1, 3, 3, 0,1,1};

        int el  = -1;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(el != arr[i]) {
                el = arr[i];
                list.add(el);
            }
        }
        System.out.println(list.toString());
//        Integer[] array = list.toArray(new Integer[list.size()]);
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));

        // 자바 Integer[] -> int[]
        int[] array1 = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array1));
    }
}
