package _2023.March._20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//보류
//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class ReportResult {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[][] reportStrings = new String[report.length][2];

        for(String name : id_list){
            map.put(name, 0);
        }

        for(int i=0; i<reportStrings.length; i++){
            reportStrings[i] = report[i].split(" ");
        }

        

        return answer;
    }
    public static void main(String[] args) {
        String[] id = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(Arrays.toString(solution(id, report, 2)));
    }
}
