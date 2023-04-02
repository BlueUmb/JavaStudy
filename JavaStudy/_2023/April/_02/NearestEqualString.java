package _2023.April._02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class NearestEqualString {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] strArray = s.split("");

        for(int i=0; i<strArray.length; i++){
            if(!map.containsKey(strArray[i])){
                answer[i] = -1;
                map.put(strArray[i], i);
            }else{
                int value = map.get(strArray[i]);
                answer[i] = i-value;
                map.put(strArray[i], i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("foobar")));
    }
}
