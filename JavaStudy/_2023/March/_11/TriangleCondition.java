package _2023.March._11;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120889
public class TriangleCondition {
    public static int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2] ? 1 : 2 ;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(solution(a));
    }
}
