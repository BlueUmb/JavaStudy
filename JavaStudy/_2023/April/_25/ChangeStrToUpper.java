package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181873
public class ChangeStrToUpper {
    public static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
    public static void main(String[] args) {
        System.out.println(solution("programmers", "p"));
    }
}
