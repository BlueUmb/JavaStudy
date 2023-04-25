package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181910
public class AfterNChar {
    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }
}
