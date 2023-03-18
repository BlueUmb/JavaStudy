package _2023.March._11;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120854
public class ArrayLength {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i=0;

        for(String str : strlist){
            answer[i] = str.length();
            i++;
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] a = {"We", "are", "the", "world!"};
        int[] answer = solution(a);
        System.out.println(Arrays.toString(answer));
    }
}
