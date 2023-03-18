package _2023.March._12;

import java.util.ArrayList;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120850
public class StringSort_1 {
    public static ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        String num = "0123456789";

        for(int i =0; i<my_string.length(); i++){
            if(num.contains(String.valueOf(my_string.charAt(i)))){
                answer.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }

        answer.sort(null);

        return answer;
    }
    public static void main(String[] args) {
        ArrayList<Integer> answer = solution("hi12392");

        for(int n : answer){
            System.out.println(n);
        }
    }
}
