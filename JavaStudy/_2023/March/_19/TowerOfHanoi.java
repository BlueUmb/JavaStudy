package _2023.March._19;

import java.util.ArrayList;
import java.util.Arrays;

//Lv2
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12946
public class TowerOfHanoi {
    public static ArrayList<int[]> answerList = new ArrayList<int[]>();
    
    public static int[][] solution(int n) { 
        int[][] answer = new int[(int)Math.pow(2, n)-1][2];
    
        hanoi(n, 1, 3, 2);

        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    public static void hanoi(int n, int start, int goal, int mid){
        if(n==1){
            answerList.add(new int[]{start,goal});
            return;
        }

        hanoi(n-1, start, mid, goal);

        answerList.add(new int[] {start,goal});

        hanoi(n-1, mid, goal, start);
        
    }
    public static void main(String[] args) {
        int[][] answer = solution(2);

        for(int[] a : answer){
            System.out.print(Arrays.toString(a)+" ");
        }
        
    }
}
