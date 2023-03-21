package _2023.March._21;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120860
public class SquareArea {
    public static int solution(int[][] dots) {
        int Xmax = dots[0][0], Ymax = dots[0][1], Xmin = dots[0][0], Ymin = dots[0][1];

        for(int[] numArr : dots){
            Xmax = Math.max(numArr[0], Xmax);
            Ymax = Math.max(numArr[1], Ymax);

            Xmin = Math.min(numArr[0], Xmin);
            Ymin = Math.min(numArr[1], Ymin);
        }
        
        return (Xmax - Xmin) * (Ymax - Ymin);
    }
    public static void main(String[] args) {
        int[][] array = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        System.out.println(solution(array));
    }
}
