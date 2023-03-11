package _2023.March._11;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120811
public class FindMiddleNum {
    public static int solution(int[] array) {
        
        Arrays.sort(array);

        return array[array.length / 2];
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 7, 10, 11};
        System.out.println(solution(a));
    }
}
