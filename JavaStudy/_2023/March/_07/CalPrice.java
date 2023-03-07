package _2023.March._07;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class CalPrice {
    public static long solution(int price, int money, int count) {
        long answer = money;

        for(int i=0; i<count; i++){
            answer -= price * (i+1);
        }

        return answer >= 0 ? 0 : answer*(-1);
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
