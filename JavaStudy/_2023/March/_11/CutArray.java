package _2023.March._11;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120833
public class CutArray {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for(int i=0; i<=answer.length - 1; i++){
            answer[i] = numbers[i + num1];
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] answer = solution(a, 1, 3);

        System.out.println(Arrays.toString(answer));
    }
}
