package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181842
public class Substring {
    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution("abc","aabcc"));
    }
}
