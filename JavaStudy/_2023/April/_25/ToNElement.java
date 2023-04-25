package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181889
public class ToNElement {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i<n; i++){
            answer[i] = num_list[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        System.out.println(Arrays.toString(solution(num_list, 1)));
    }
}
