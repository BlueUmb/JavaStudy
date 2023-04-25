package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class FindString {
    public static int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        return myString.contains(pat) ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
    }
}
