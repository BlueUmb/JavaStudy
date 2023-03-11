package _2023.March._11;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120903
public class ArraySimilar {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String a : s1){
            for(String b : s2){
                if(a.equals(b)){
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] a = {"a", "b", "c"};
        String[] b = {"com", "b", "d", "p", "c"};
        System.out.println(solution(a, b));
    }
}
