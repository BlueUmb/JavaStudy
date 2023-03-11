package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120898
public class Letter {
    public static int solution(String message) {
        return message.length() * 2;
    }
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
    }
}
