package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181843
public class CheckSubstring {
    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
    }
}
