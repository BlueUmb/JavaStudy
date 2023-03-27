package _2023.March._27;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120876
public class OverlapLinesLength {
    public static int solution(int[][] lines) {
        int answer = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i<lines.length; i++){
            start = Math.min(start, lines[i][0]);
            end = Math.max(end, lines[i][1]);
        }
        
        for(int i=start; i<end; i++){
            int count = 0; 
            for(int j=0; j<lines.length; j++){
                if(lines[j][0]<=i && lines[j][1] >= i+1){
                    count++;
                }  
            }
            if(count > 1){
                answer++;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        int[][] lines = {{-1,1},{1,3},{3,9}};//{{0, 1}, {2, 5}, {3, 9}};//{{0,5},{3,9},{1,10}};
        System.out.println(solution(lines));
    }
}
