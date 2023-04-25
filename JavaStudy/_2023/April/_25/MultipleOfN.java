package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181937
public class MultipleOfN {
    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0 ;
    }
    public static void main(String[] args) {
        System.out.println(solution(98, 2));
    }
}
