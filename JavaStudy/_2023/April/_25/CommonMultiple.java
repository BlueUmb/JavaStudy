package _2023.April._25;

//Lv0
//문제 링크 :https://school.programmers.co.kr/learn/courses/30/lessons/181936
public class CommonMultiple {
    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0 ;
    }
    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));
    }
}
