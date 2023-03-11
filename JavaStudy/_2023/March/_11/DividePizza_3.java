package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120816
public class DividePizza_3 {
    public static int solution(int slice, int n) {
        return n % slice > 0 ? n / slice + 1 : n / slice;
    }
    public static void main(String[] args) {
        System.out.println(solution(4,12));
    }
}
