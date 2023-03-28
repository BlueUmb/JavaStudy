package _2023.March._27;

//Lv0
//문제 해결 : https://school.programmers.co.kr/learn/courses/30/lessons/120866
public class SafeZone {
    public static int solution(int[][] board) {
        int[][] newBoard = new int[board.length][board.length];

        for(int i =0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    danger(i, j, newBoard);
                }
            }
        }

        return (int)Math.pow(board.length, 2) - count(newBoard);
    }

    public static void danger(int i, int j, int[][] board){
        board[i][j] = 1;
        if(i>0){board[i-1][j]=1;}
        if(i<board.length-1){board[i+1][j]=1;}
        if(j>0){board[i][j-1]=1;}
        if(j<board.length-1){board[i][j+1]=1;}
        if(i>0 && j>0){board[i-1][j-1]=1;}
        if(i<board.length-1 && j<board.length-1){board[i+1][j+1]=1;}
        if(i>0 && j<board.length-1){board[i-1][j+1]=1;}
        if(i<board.length-1 && j>0){board[i+1][j-1]=1;}
    }

    public static int count(int[][]board){
        int num = 0;

        for(int[] y : board){
            for(int x : y){
                if(x==1){num++;}
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0}};
        System.out.println(solution(board));
    }
}
