package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181839
public class DiceGame_1 {
    public static int solution(int a, int b) {
        if(a%2==1 && b%2==1){
            return (int)(Math.pow(a, 2) + Math.pow(b, 2));
        }else if(a%2==1 || b%2==1){
            return 2 * (a + b);
        }else{
            return Math.abs(a - b);
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
    }

}
