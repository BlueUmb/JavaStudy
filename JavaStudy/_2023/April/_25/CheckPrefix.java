package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class CheckPrefix {
    public static int solution(String my_string, String is_prefix) {
        my_string = my_string.replaceAll(is_prefix, " ");
        return my_string.charAt(0) == ' ' ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution("banana","ban"));
    }
}
