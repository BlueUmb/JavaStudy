package _2023.April._08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//11~15 시간초과
//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131128
public class NumPartner {
    public static String solution(String X, String Y) {
        String answer = "";
        ArrayList<String> XArr = new ArrayList<String>(Arrays.asList(X.split("")));
        ArrayList<String> YArr = new ArrayList<String>(Arrays.asList(Y.split("")));
        ArrayList<String> partnerArr = new ArrayList<String>();
        ArrayList<String> zero = new ArrayList<>();
        zero.add("0");

        for(int i=0; i<YArr.size(); i++){
            if(XArr.contains(YArr.get(i))){
                XArr.remove(XArr.indexOf(YArr.get(i)));
                partnerArr.add(YArr.get(i));
            }
        }

        if(partnerArr.isEmpty()){
            answer = "-1";
        }else{
            partnerArr.sort(Collections.reverseOrder());
            for(int i=0; i<partnerArr.size(); i++){
                answer+=partnerArr.get(i);
            }

            if(partnerArr.removeAll(zero)){
                if(partnerArr.isEmpty()){
                    answer = "0";
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("1000000002", "20200"));
        //System.out.println(solution("100", "203045"));
        //System.out.println(solution("12321", "42531"));
    }
}
