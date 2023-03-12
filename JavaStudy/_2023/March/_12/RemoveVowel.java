package _2023.March._12;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120849
public class RemoveVowel {
    public static String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        String vowel = "aeiou";

        for(String s : strArr){
            if(!vowel.contains(s)){
                answer+=s;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("bus"));
    }
}
