package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181877
public class ChangeToUpper {
    public static String solution(String myString) {
        myString = myString.toUpperCase();
        return myString;
    }
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
    }
}
