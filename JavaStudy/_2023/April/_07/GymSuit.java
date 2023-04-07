package _2023.April._07;

import java.util.Arrays;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class GymSuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        int reserve_arr[]=new int[reserve.length];
        int lost_arr[]=new int[lost.length];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    reserve_arr[j]=1;
                    lost_arr[i]=1;
                    answer++;
                    break;
                }              
            }
        }

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                int gap = Math.abs(lost[i]-reserve[j]);
                if( gap==1 && reserve_arr[j]==0 && lost_arr[i]==0 ){
                    answer++;
                    lost_arr[i]=1;
                    reserve_arr[j]=1;
                    break; 
                }               
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(5, lost, reserve));
    }
}
