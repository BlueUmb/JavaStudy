package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class ConvertSequences_1 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50 && arr[i]%2==0){
                answer[i] = arr[i]/2;
            }else if(arr[i]<50 && arr[i]%2==1){
                answer[i] = arr[i]*2;
            }else{
                answer[i] = arr[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
