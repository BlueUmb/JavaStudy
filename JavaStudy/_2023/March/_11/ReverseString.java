package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120822
public class ReverseString {
    public static String solution(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer += my_string.charAt(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }
}
