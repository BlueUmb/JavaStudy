package _2023.March._12;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120905
public class MultipleN {
    public static int[] solution(int n, int[] numlist) {
        int count = 0;
        for(int num : numlist){
            if(num%n==0){
                count++;
            }
        }
        
        int[] answer = new int[count];

        for(int i=0,j=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                answer[j] = numlist[i];
                j++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer = solution(3, num);

        System.out.println(Arrays.toString(answer));
    }
}
