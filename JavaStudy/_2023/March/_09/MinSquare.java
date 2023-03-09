package _2023.March._09;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86491
//명함을 가로로 눕혀서 넣는다는 뜻은 가로세로의 구분이 없이 두개의 값을 정렬해서 배열의 최대값을 구하면 된다는 뜻이다.
public class MinSquare {
    public static int solution(int[][] sizes) {
        int w=0, h=0;

        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }

        w = sizes[0][0];
        h = sizes[0][1];
        for(int i=0; i<sizes.length; i++){
            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }
       
        return w*h;
    }

    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(solution(arr));
    }
}
