package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120818
public class DiscountCloth {
    public static int solution(int price) {
        double answer = 0;

        if(price >= 500000){
            answer = price * 0.8;
        }else if(price >= 300000){
            answer = price * 0.9;
        }else if(price >= 100000){
            answer = price * 0.95;
        }else{
            answer = price;
        }

        return (int)answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
