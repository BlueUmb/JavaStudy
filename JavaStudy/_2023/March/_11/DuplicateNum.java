package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120583
public class DuplicateNum {
    public static int solution(int[] array, int n) {
        int answer = 0;

        for(int num : array){
            if(num == n){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 5};
        System.out.println(solution(a , 1));
    }
}
