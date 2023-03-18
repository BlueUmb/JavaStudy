package _2023.March._13;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120862
public class MakeMaxValue_2 {
    public static int solution(int[] numbers) {
        
        Arrays.sort(numbers);

        return Math.max(numbers[0] * numbers[1] , numbers[numbers.length-1] * numbers[numbers.length-2]);
    }
    public static void main(String[] args) {
        int[] num = {1, 2, -3, 4, -5};
        System.out.println(solution(num));
    }
}
