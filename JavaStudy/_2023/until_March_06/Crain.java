package _2023.until_March_06;

import java.util.ArrayList;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Crain {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        //뽑은 인형을 담을 ArrayList선언
        ArrayList list = new ArrayList<Integer>();

        
        for(int movespos = 0; movespos<moves.length; movespos++){   //moves배열에 담긴 값의 수만큼 인형뽑기 수행 반복문
            for(int i=0; i<board.length; i++){  //이차원배열 board에서 0이 아닌 값을 찾기위한 반복문
                if(board[i][moves[movespos]-1] != 0){   //moves배열에 담긴 값(열)중 0이 아닌값이 있을경우 if문 진입
                    list.add(board[i][moves[movespos]-1]);  //ArrayList에 찾은 값을 저장
                    board[i][moves[movespos]-1] = 0;    //board에서 뽑은 인형의 위치에 0값으로 초기화
                    break;  //반복문 탈출
                }
            }
            for(int listindex = list.size()-1; listindex > 0; listindex--){ //ArrayList에 담긴 인형의 수만큼 반복
                if(list.size()>=2 && list.get(listindex)==list.get(listindex-1)){   //인형의 갯수가 2개이상이고, ArrayList에 담겨있는 값중 연속된값 2개가 일치할경우 if문 진입
                    list.remove(listindex); //일치하는 2개의 값중 뒤의 값을 제거
                    list.remove(listindex-1);   //일치하는 2개의 값중 앞의 값을 제거    
                    //뒤에부터 제거하는 이유는 ArrayList 특성상 중간 값이 사라지면 뒤에있는 데이터들이 앞으로 당겨져 인덱스가 변하기때문에
                    //뒤에서부터 제거하여 오류 방지
                    answer+=2;  //2개의 값을 제거하였으므로 answer에 2더하기
                    break;  //반복문 탈출
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] answer = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] move = {1,5,3,5,1,2,1,4};
        System.out.println(solution(answer,move));
    }
}
