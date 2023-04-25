package _2023.April._25;

import java.util.Scanner;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181944
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
        
        sc.close();
    }
}
