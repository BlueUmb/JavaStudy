package _2023.March._31;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class Coke {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while(n/a > 0){  
            answer += ( n / a ) * b;
            n = (( n / a ) * b) + (n % a);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(3, 1, 20));
    }
}
