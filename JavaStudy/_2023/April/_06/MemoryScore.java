package _2023.April._06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class MemoryScore {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }

        int i=0;
        for(String[] names : photo){
            for(String person : names){
                if(map.containsKey(person)){
                    answer[i] += map.get(person);
                }
            }
            i++;
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }
}
