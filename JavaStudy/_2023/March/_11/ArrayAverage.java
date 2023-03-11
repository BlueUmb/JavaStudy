package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120817
public class ArrayAverage {
    public static double solution(int[] numbers) {
        double answer = 0;

        for(int num : numbers){
            answer += num;
        }

        return answer/numbers.length;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(a));
    }
}
