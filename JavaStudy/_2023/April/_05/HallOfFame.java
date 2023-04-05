package _2023.April._05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class HallOfFame {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<score.length; i++){
            if(list.size() == k){
                list.add(k-1,Math.max(list.get(k-1), score[i]));
                list.remove(k);
            }else{
                list.add(score[i]);
            }
            list.sort(Collections.reverseOrder());
            answer[i] = list.get(list.size()-1);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(3, score)));
    }
}
