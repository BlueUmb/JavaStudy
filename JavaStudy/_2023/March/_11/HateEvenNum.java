package _2023.March._11;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120813
public class HateEvenNum {
    public static int[] solution(int n) {
        int[] answer = new int[n%2==0 ? n/2 : n/2+1];
        
        for(int i=1, j=0; i<=n; i++){
            if(i%2==1){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15)));
    }
}
