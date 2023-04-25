package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181888
public class ElementsNIntervals {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int)Math.ceil((double)num_list.length / (double)n)];

        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i*n];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        System.out.println(Arrays.toString(solution(num_list, 2)));
    }
}
