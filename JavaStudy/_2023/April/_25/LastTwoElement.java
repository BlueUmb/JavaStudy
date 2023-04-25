package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181927
public class LastTwoElement {
    public static int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length+1);

        if(num_list[num_list.length-1] > num_list[num_list.length-2]){
            answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        }else{
            answer[answer.length-1] = num_list[num_list.length-1] * 2;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
