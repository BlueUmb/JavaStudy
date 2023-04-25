package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181876
public class ToLower {
    public static String solution(String myString) {
        String answer = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<myString.length(); i++){
            if(!alpha.contains(String.valueOf(myString.charAt(i)))){
                answer += String.valueOf(myString.charAt(i)).toLowerCase();
            }else{
                answer+=myString.charAt(i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
    }
}
