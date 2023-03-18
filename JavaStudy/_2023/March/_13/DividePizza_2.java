package _2023.March._13;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120815
public class DividePizza_2 {
    public static int solution(int n) {
        int answer = 0;

        answer = n * 6 /gcd(n, 6);

        return answer / 6;
    }
    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
