package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181875
public class ArrayConvert {
    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            }else{
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println(Arrays.toString(solution(strArr)));
    }
}
