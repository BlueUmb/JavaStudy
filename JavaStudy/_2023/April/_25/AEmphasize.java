package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181874
public class AEmphasize {
    public static String solution(String myString) {
        myString = myString.toLowerCase();
        return myString.replaceAll("a", "A");
    }
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
    }
}
