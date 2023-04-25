package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181941
public class StrListToStrArr {
    public static String solution(String[] arr) {
        String answer = "";

        for(String str : arr){
            answer += str;
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        System.out.println(solution(arr));
    }
}
