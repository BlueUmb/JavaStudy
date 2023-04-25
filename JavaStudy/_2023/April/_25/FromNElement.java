package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181892
public class FromNElement {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];

        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i+n-1];
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        System.out.println(Arrays.toString(solution(num_list, 3)));
    }
}
