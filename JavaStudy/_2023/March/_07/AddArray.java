package _2023.March._07;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12950
public class AddArray {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i< arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int[][] answer = solution(arr1, arr2);

        for(int[] num : answer){
            for(int n : num){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    
}
