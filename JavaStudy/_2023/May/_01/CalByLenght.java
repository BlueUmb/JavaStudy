package _2023.May._01;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181854
public class CalByLenght {
    public static int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0){
            for(int i=1; i<arr.length; i+=2){
                arr[i] += n;
            }
        }else{
            for(int i=0; i<arr.length; i+=2){
                arr[i] += n;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        System.out.println(Arrays.toString(solution(arr, 27)));
    }
}
