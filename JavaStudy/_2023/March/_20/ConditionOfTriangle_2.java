package _2023.March._20;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120868
public class ConditionOfTriangle_2 {
    public static int solution(int[] sides) {
        int start = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]) + 1;
        int end = Math.max(sides[0], sides[1]) + Math.min(sides[0], sides[1]) - 1;
        
        return end - start + 1;
    }
    public static void main(String[] args) {
        int[] array = {3, 6};
        System.out.println(solution(array));
    }
}
