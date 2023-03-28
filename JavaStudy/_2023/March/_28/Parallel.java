package _2023.March._28;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120875
public class Parallel{
    public static int solution(int[][] dots) {
        float[][] floatDots = new float[dots.length][2];

        for(int i=0; i<dots.length; i++){
            for(int j=0; j<dots[i].length; j++){
                floatDots[i][j] = (float)dots[i][j];
            }
        }
        
        for(int i = 0; i<dots.length; i++){
            float inclination1 = (floatDots[i][1] - floatDots[(i+1)%4][1]) / (floatDots[i][0] - floatDots[(i+1)%4][0]);
            float inclination2 = (floatDots[(i+2)%4][1] - floatDots[(i+3)%4][1]) / (floatDots[(i+2)%4][0] - floatDots[(i+3)%4][0]);;
            if(inclination1 == inclination2){
                return 1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};//{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(solution(dots));
    }
}