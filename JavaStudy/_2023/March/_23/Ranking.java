package _2023.March._23;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120882
public class Ranking {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);

        for(int i=0; i<score.length; i++){
            for(int j = 0; j<score.length; j++){
                if(score[i][0] + score[i][1] > score[j][0] + score[j][1]){
                    answer[j]++; 
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] array = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};//{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(solution(array)));
    }
}
