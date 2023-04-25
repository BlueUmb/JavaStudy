package _2023.April._25;

import java.util.Scanner;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181947
public class PrintAdditionExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));

        sc.close();
    }
}
