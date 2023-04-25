package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181869
public class SeparateBySpace_1 {
    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
    }
}
