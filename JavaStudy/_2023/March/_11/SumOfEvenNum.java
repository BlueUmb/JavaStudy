package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120831
public class SumOfEvenNum {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(i%2==0){
                answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
