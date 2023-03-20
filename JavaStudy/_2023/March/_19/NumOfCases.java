package _2023.March._19;

import java.math.BigInteger;

//4점
//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120840
public class NumOfCases {
    public static BigInteger solution(int balls, int share) {
        BigInteger bigBalls = new BigInteger(String.valueOf(factorial(balls)));
        BigInteger bigShare = new BigInteger(String.valueOf(factorial(share)));
        BigInteger bigBs = new BigInteger(String.valueOf(factorial(balls-share)));

        return bigBalls.divide(bigBs.multiply(bigShare));
    }
    public static BigInteger factorial(int num){
        if(num>0){
            return factorial(num-1).multiply(BigInteger.valueOf(num));
        }
        return BigInteger.ONE;
    }
    public static void main(String[] args) {
        System.out.println(solution(2,2));
    }
}
