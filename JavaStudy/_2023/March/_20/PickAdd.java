package _2023.March._20;

import java.util.ArrayList;
import java.util.Arrays;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68644
class Solution {
    public static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!list.contains(numbers[i]+numbers[j])){
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);

        return answer;
    }   

    public static void main(String[] args) {
        int[] num = {5,0,2,7};
        System.out.println(Arrays.toString(solution(num)));
    }
}
