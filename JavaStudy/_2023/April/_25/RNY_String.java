package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181863
public class RNY_String {
    public static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
    }
}
