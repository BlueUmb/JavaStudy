package _2023.March._12;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120909
public class SquareNum {
    public static int solution(int n) {
        int answer = 2;

        if(Math.sqrt(n) % 1 == 0){
            answer = 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(976));
    }
}
