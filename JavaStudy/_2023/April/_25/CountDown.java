package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181899
public class CountDown {
    public static int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int i=start;

        while(true){
            if(i < end){
                break;
            }
            answer[start - i] = i;
            i--;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
    }
}
