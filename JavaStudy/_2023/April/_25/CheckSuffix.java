package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class CheckSuffix {
    public static int solution(String my_string, String is_suffix) {
        return my_string.lastIndexOf(is_suffix) == my_string.length()-is_suffix.length() ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
    }
}
