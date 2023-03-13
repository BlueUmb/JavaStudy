package _2023.March._13;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120911
public class StringSort_2 {
    public static String solution(String my_string) {
        String answer = "";
        char[] chArr = my_string.toCharArray();

        for(int i=0; i<chArr.length; i++){
            if(chArr[i] >= 65 && chArr[i] <= 90){
                chArr[i] = (char)(chArr[i]+32);
            }
        }

        Arrays.sort(chArr);
    
        for(char ch : chArr){
            answer+=ch;
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }
}
