package _2023.March._18;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120902
public class CalculateString {
    public static int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.valueOf(strArr[0]);

        for(int i=1; i<strArr.length; i+=2){
            if(strArr[i].equals("-")){
                answer += Integer.valueOf(strArr[i+1]) * (-1);
            }else{
                answer += Integer.valueOf(strArr[i+1]);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }
}
