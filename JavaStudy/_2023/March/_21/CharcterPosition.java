package _2023.March._21;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120861
public class CharcterPosition {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for(String move : keyinput){
            switch(move){
                case "left":
                    answer[0] -= 1;
                    break;
                case "right":
                    answer[0] += 1;
                    break;
                case "down":
                    answer[1] -= 1;
                    break;
                case "up":
                    answer[1] += 1;
                    break;
            }
            if(answer[0] > board[0]/2){
                answer[0] = board[0]/2;
            }else if(answer[0] < -(board[0]/2)){
                answer[0] = -board[0]/2;
            }

            if(answer[1] > board[1]/2){
                answer[1] = board[1]/2;
            }else if(answer[1] < -(board[1]/2)){
                answer[1] = -board[1]/2;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] array = {"down", "down", "down", "down", "down"};
        int[] array2 = {7, 9};
        System.out.println(Arrays.toString(solution(array, array2)));
    }
}
