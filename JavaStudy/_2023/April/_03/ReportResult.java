package _2023.April._03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class ReportResult {
    public static Integer[] solution(String[] id_list, String[] report, int k) {
        Map<String,Integer> answer = new LinkedHashMap<String,Integer>();
        Map<String,Integer> reportMap = new HashMap<String,Integer>();
        ArrayList<String> banned = new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        
        report = hashSet.toArray(new String[0]);

        String[][] history = new String[report.length][2];

        for(int i=0; i<report.length; i++){
            history[i] = report[i].split(" ");
        }

        for(String id : id_list){
            answer.put(id,0);
        }

        for(int i=0; i<history.length; i++){
            if(reportMap.containsKey(history[i][1])){
                int value = reportMap.get(history[i][1]);
                reportMap.put(history[i][1], value+1);
            }else{
                reportMap.put(history[i][1], 1);
            }
        }

        for(Map.Entry<String,Integer> element : reportMap.entrySet()){
            if(element.getValue() >= k){
                banned.add(element.getKey());
            }
        }

        for(int i=0; i<history.length; i++){
            for(int j=0; j<banned.size(); j++){
                if(banned.get(j).equals(history[i][1])){
                    int value = answer.get(history[i][0]);
                    answer.put(history[i][0], value+1);
                }
            }
        }

        return answer.values().toArray(new Integer[answer.size()]);
    }
    public static void main(String[] args) {
        String[] id ={"muzi", "frodo", "apeach", "neo"};// {"con", "ryan"};
        String[] report ={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};// {"ryan con", "ryan con", "ryan con", "ryan con"};
        System.out.println(Arrays.toString(solution(id, report, 2)));

    }
}
