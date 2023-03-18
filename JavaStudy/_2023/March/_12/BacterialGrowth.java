package _2023.March._12;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120910
public class BacterialGrowth {
    public static int solution(int n, int t) {
        return n*(int)Math.pow(2, t);
    }
    public static void main(String[] args) {
        System.out.println(solution(2,10));
    }
}
