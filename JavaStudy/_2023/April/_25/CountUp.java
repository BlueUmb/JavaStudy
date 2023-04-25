package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class CountUp {
    public static int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];

        for(int i=0; i<answer.length; i++){
            answer[i] = start+i;
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
    }
}
