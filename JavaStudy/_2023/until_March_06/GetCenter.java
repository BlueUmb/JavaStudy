package _2023.until_March_06;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class GetCenter {
    public static String solution(String s) {
        String answer = "";

        if(s.length()%2==0){
            answer += String.valueOf(s.charAt(s.length()/2-1)) + s.charAt(s.length()/2);
        }else{
            answer += s.charAt(s.length()/2);
        }

        return answer;
    }
    public static void main(String[] args) {
        String str = "qwer";
        System.out.println(solution(str));
    }
}
