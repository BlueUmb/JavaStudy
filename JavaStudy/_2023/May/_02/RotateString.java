package _2023.May._02;

import java.util.Scanner;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181945
public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }

        sc.close();
    }
}
