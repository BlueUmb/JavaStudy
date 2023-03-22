package _2023.March._22;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120884
public class ChickenCoupon {
    public static int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

        while(true){
            coupon += chicken;
            if(coupon < 10){
                break;
            }
            if(coupon >= 10){
                answer += coupon / 10;
                chicken = coupon / 10;
                coupon %= 10;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(1081));
    }
}
