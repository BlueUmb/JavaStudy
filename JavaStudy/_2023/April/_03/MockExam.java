package _2023.April._03;

import java.util.ArrayList;
import java.util.Arrays;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class MockExam {
    public static int[] solution(int[] answers) {
        int max = 0;
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5]){
                scores[0]++;
            }
            if(answers[i] == b[i%8]){
                scores[1]++;
            }
            if(answers[i] == c[i%10]){
                scores[2]++;
            }
        }

        for(int i =0; i<scores.length; i++){
            max = Math.max(scores[i], max);
        }

        for(int i=0; i<scores.length; i++){
            if(scores[i] == max){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(value -> value).toArray();
    }
    public static void main(String[] args) {
        int[] answer = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answer)));
    }
}
