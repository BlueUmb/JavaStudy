package _2023.March._11;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120847
public class MakeMaxValue {
    public static int solution(int[] numbers) {
        
        Arrays.sort(numbers);

        return numbers[numbers.length-1] * numbers[numbers.length - 2]; 
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(solution(a));
    }
}
