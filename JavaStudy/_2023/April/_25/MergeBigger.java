package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181939
public class MergeBigger {
    public static int solution(int a, int b) {
        String numA = String.valueOf(a)+String.valueOf(b);
        String numB = String.valueOf(b)+String.valueOf(a);
        
        return Math.max(Integer.parseInt(numA), Integer.parseInt(numB));
    }
    public static void main(String[] args) {
        System.out.println(solution(9, 91));
    }
}
