package _2023.until_March_06;

public class SumBetweenNum {
    public static long solution(int a, int b) {
        long answer = 0;

        for(int i=Math.min(a, b); i<=Math.max(a, b); i++){
            answer += i;
        }

        return answer;
    }    

    public static void main(String[] args) {
        System.out.println(solution(3,5));
    }
}
