package _2023.March._11;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120824
public class EvenOddNumCount {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int n : num_list){
            if(n % 2 == 0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(a)));
    }
}
