package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120585
public class Taller {
    public static int solution(int[] array, int height) {
        int answer = 0;
        
        for(int num : array){
            if(height < num){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {149, 180, 192, 170};
        System.out.println(solution(a, 167));
    }
}
