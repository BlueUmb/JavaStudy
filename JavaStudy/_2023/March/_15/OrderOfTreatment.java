package  _2023.March._15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120835
public class OrderOfTreatment{
    public static int[] solution(int[] emergency) {
        int[] answer = emergency.clone();

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        Arrays.sort(emergency);

        for(int i=0; i<emergency.length; i++){
            map.put(emergency[i], emergency.length-i);
        }
        
        for(int i =0; i<answer.length; i++){
            answer[i] = map.get(answer[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3, 76, 24};
        
        System.out.println(Arrays.toString(solution(arr)));
    }
}