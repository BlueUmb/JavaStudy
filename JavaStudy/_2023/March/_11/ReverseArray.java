package _2023.March._11;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120821
public class ReverseArray {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int i = num_list.length-1;

        for(int num : num_list){
            answer[i] = num;
            i--; 
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(a)));
    }
}
