package _2023.March._13;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120834
public class ExoplanetsAge {
    public static String solution(int age) {
        String answer = "";
        String[] strArr = String.valueOf(age).split("");

        for(String num : strArr){
            answer += (char)(Integer.valueOf(num)+97);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(23));
    }
}
