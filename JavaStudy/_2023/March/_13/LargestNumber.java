package _2023.March._13;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120899
public class LargestNumber {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int index = 0;

        for(int i=1; i<array.length; i++){
            if(array[index] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
                index = i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 8, 3};
        System.out.println(Arrays.toString(solution(a)));
    }
}
