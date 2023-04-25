package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181901
public class MakeArray_1 {
    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for(int i=0; i<answer.length; i++){
            answer[i] = (i+1)*k;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
    }
}
