package _2023.March._12;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120908
public class StringInString {
    public static int solution(String str1, String str2) {
        int answer = 2;

        if(str1.contains(str2)){
            answer = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("ppprrrogrammers", "pppp"));
    }
}
