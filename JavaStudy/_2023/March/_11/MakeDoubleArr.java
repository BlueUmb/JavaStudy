package _2023.March._11;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120809
public class MakeDoubleArr {
    public static int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers[i]*2;
        }

        return numbers;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(a)));
    }
}
