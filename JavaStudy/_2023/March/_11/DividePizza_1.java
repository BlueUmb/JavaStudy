package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120814
public class DividePizza_1 {
    public static int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
