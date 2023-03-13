package _2023.March._13;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120844
public class RotateArray {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){
            if(direction.equals("right")){
                answer[i] = i == 0 ? numbers[numbers.length-1] : numbers[i-1];
            }else{
                answer[i] = i == numbers.length-1 ? numbers[0] : numbers[i+1];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println(Arrays.toString(solution(number, "left")));
    }
}
