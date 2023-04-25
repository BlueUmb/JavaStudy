package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class ReturnValueByFlag {
    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
    }
}
