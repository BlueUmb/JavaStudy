package _2023.March._12;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120845
public class DiceCount {
    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n); 
    }
    public static void main(String[] args) {
        int[] a = {10, 8, 6};
        System.out.println(solution(a, 3));
    }
}
