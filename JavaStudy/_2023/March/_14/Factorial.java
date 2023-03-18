package _2023.March._14;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120848
public class Factorial {
    public static int solution(int n) {
        int answer = 1;
        int num = 1;

        while(num<=n){
            answer++;
            num *= answer;
        }

        return answer-1;
    }
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
