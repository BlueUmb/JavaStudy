package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120826
public class RemoveSpecificChar {
    public static String solution(String my_string, String letter) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            answer += String.valueOf(my_string.charAt(i)).equals(letter) ? "" : String.valueOf(my_string.charAt(i));
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcdef","f"));
    }
}
