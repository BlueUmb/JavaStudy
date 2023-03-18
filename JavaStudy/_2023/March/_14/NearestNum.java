package _2023.March._14;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120890
public class NearestNum {
    public static int solution(int[] array, int n) {
        Arrays.sort(array);

        int answer = array[0];
        int near = Math.abs(n-array[0]);

        for(int num : array){
            if(Math.abs(n-num) < near){
                near = Math.abs(n-num);
                answer = num;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] array = {2,2,3};
        System.out.println(solution(array, 1));
    }
}
