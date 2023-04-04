package _2023.April._04;

import java.util.Arrays;
import java.util.Collections;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Fruiterer {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int box = score.length/m;
        Integer[] copyScore = Arrays.stream(score).boxed().toArray(Integer[]::new);

        Arrays.sort(copyScore,Collections.reverseOrder());

        for(int i=0; i<box; i++){
            int min = 9;

            for(int j=i*m; j<(i+1)*m; j++){
                min = Math.min(copyScore[j], min);
            }
            answer += (min*m);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1}; //{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(3, 4, score));
    }
}
