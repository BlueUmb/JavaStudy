package _2023.March._26;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120812
public class ModeNum {
    public static int solution(int[] array) {
        int answer = 0, mode = 0, count = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int num : array){
            if(map.containsKey(num)){
                int value = map.get(num);
                map.put(num, value+1);
            }else{
                map.put(num, 1);
            }
        }

        for(Entry<Integer,Integer> element : map.entrySet()){
            if(mode < element.getValue()){
                mode = element.getValue();
                answer = element.getKey();
            }
        }

        for(Entry<Integer,Integer> element : map.entrySet()){
            if(element.getValue() == mode){
                count++;
            }
        }

        return count > 1 ? -1 : answer;
    }
    public static void main(String[] args) {
        int[] num = {1, 1, 2, 2};//{1, 2, 3, 3, 3, 4};
        System.out.println(solution(num));
    }
}
