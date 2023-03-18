package _2023.March._18;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120913
public class CutSaveToArray {
    public static String[] solution(String my_str, int n) {
        int range = my_str.length()%n > 0 ? my_str.length()/n+1 :my_str.length()/n;
        String[] answer = new String[range];

        for(int i=0; i<range; i++){
            int start = i*n;
            int end = (i*n) + n;
            answer[i] = end <= my_str.length() ? my_str.substring(start, end) : my_str.substring(start, my_str.length());
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }
}
