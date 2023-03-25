package _2023.March._25;

import java.util.ArrayList;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120921
public class PushString {
    public static int solution(String A, String B) {
        int answer = -1;
        
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<A.length(); i++){
            list.add(String.valueOf(A.charAt(i)));
        }

        for(int i=0; i<list.size(); i++){
            String word = "";
            for(String s : list){
                word += s;
            }
            if(word.equals(B)){
                return i;
            }
            list.add(0,list.get(list.size()-1));
            list.remove(list.size()-1);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
    }
}
