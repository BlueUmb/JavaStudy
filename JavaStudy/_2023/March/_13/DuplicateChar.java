package _2023.March._13;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120888
public class DuplicateChar {
    public static String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");

        for(String str : strArr){
            if(!answer.contains(str)){
                answer += str; 
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("people"));
    }
}
