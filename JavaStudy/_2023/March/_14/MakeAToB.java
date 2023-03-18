package _2023.March._14;

import java.util.HashMap;
import java.util.Map;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120886'
//map으로 하지않고 두개의 String을 배열로 만들어 sort시킨후 비교하여 같을경우 1 아닐경우 0리턴하면 편함
public class MakeAToB {
    public static int solution(String before, String after) {
        int answer = 1;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Map<String,Integer> map = new HashMap<String,Integer>();

        for(String beforeStr : beforeArr){
            if(map.containsKey(beforeStr)){
                int value = map.get(beforeStr);
                map.put(beforeStr, value+1);
            }
            else{
                map.put(beforeStr, 1);
            }
            
        }
        
        for(String afterStr : afterArr){
            if(map.containsKey(afterStr)){
                int value = map.get(afterStr);
                map.put(afterStr, value-1);
            }else{
                map.put(afterStr, -1);
            }
        }

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if(element.getValue()!=0){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
    }
}
