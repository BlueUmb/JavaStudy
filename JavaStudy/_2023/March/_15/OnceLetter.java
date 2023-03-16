package _2023.March._15;

import java.util.HashMap;
import java.util.Map;

//예외를 찾지못해 보류
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120896
public class OnceLetter {
    public static String solution(String s) {
        String answer = "";
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] strArr = s.split("");

        //Arrays.sort(strArr);

        for(String str : strArr){
            if(map.containsKey(str)){
                int value = map.get(str);
                map.put(str, value+1);
            }else{
                map.put(str, 1);
            }
        }

        for(Map.Entry<String,Integer> element : map.entrySet()){
            System.out.println(element.getKey()+" : "+element.getValue() );
            if(element.getValue()==1){
                answer += element.getKey();
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("a b"));
    }
}
