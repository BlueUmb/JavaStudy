package _2023.until_March_06;

import java.util.Arrays;
import java.util.Collections;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class StringReverse {
    public static String solution(String s) {
        String answer = "";
        Character[] charr = new Character[s.length()];

        for(int i=0; i<s.length(); i++){
            charr[i] = s.charAt(i);
        }

        Arrays.sort(charr,Collections.reverseOrder());

        for(char c : charr){
            answer += c;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
