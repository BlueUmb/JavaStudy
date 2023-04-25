package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181835
public class ConvertSequences_3 {
    public static int[] solution(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            if(k%2==0){
                arr[i] += k;
            }else{
                arr[i] *= k;
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(solution(arr, 3)));
    }
}
