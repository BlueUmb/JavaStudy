package _2023.April._02;

import java.util.HashMap;
import java.util.Map;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Phoneketmon {
    public static int solution(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums){
            if(map.containsKey(num)){
                int value = map.get(num);
                map.put(num, value+1);
            }else{
                map.put(num, 1);
            }
        }

        return nums.length/2 >= map.size() ? map.size() : nums.length/2;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
}
