package _2023.March._13;

import java.util.Scanner;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120823
public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}