package _2023.March._12;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120892
public class Decryption {
    public static String solution(String cipher, int code) {
        String answer = "";

        for(int i=1; i<=cipher.length()/code; i++){
            answer += String.valueOf(cipher.charAt(i*code-1));
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
    }
}
