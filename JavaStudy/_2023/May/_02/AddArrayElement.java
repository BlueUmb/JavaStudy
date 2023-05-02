package _2023.May._02;

import java.util.ArrayList;
import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181861
public class AddArrayElement {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int num : arr){
            for(int i=0; i<num; i++){
                list.add(num);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
