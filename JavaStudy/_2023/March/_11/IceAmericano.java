package _2023.March._11;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120819
public class IceAmericano {
    public static int[] solution(int money) {
        int[] answer = {};

        answer = new int[] {money/5500,money-(money/5500)*5500};

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15000)));
    }
}
