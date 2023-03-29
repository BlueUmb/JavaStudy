package _2023.March._30;

import java.util.Arrays;
import java.util.Comparator;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class SortStringWill {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)>o2.charAt(n)){
                    return 1;
                }else if(o1.charAt(n)<o2.charAt(n)){
                    return -1;
                }else{
                    return o1.compareTo(o2);
                }
            }
        });
        
        return strings;
    }
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};//{"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution(strings, 2)));
    }
}
