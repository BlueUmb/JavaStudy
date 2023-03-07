package _2023.until_March_06;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class DivsorArray {
    public static int[] solution(int[] arr, int divisor) {
        int count=0;
        for(int divarr : arr){
            if(divarr % divisor ==0){
                count++;
            }
        }

        int[] answer = new int[count];
        
        if(answer.length!=0){
            for(int i=0, j=0; i<arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[j] = arr[i];
                    j++;
                }
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,6};
        int[] answer = solution(arr,10);
        for(int answers : answer){
            System.out.println(answers);
        }
    }
}
