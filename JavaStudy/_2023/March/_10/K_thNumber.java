package _2023.March._10;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42748
//commands에 받은 값을 기준으로 배열자르기 start와 end를 지정하여 자른 배열 num을 sort하여 인덱스를 이용하여 데이터 추출후 answer에 담기
public class K_thNumber {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start = 0, end = 0;
        int[] num = {};
        for(int i=0; i<commands.length; i++){
            int k=0;
            start = commands[i][0];
            end = commands[i][1];
            num = new int[end - start + 1];

            for(int j=0; j<num.length; j++){
                num[k] = array[j + start -1];
                k++;
            }

            Arrays.sort(num);

            answer[i] = num[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4}; 
        int[][] command = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] answer = solution(arr,command);

        for(int a : answer){
            System.out.println(a);
        }
    }
}
