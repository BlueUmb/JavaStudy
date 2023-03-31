package _2023.March._31;

import java.math.BigInteger;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class MinValueString {
    public static int solution(String t, String p) {
        int answer = 0;
        

        for(int i=0; i<t.length()-(p.length()-1); i++){
            BigInteger string = new BigInteger(t.substring(i, i+p.length()));
            BigInteger compareNum = new BigInteger(p);
            if(string.compareTo(compareNum) == -1 || string.compareTo(compareNum) == 0){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }
}
