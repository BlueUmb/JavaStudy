package _2023.March._14;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120842
public class TwoDimensional {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        for(int i=0; i<num_list.length/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[i*n+j];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num  = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int[][] answer = solution(num, 3);

        for(int[] answer1 : answer){
            for(int answer2 : answer1){
                System.out.print(answer2+" ");
            }
            System.out.println();
        }
    }
}
