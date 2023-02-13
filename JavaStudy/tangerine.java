import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//01-17 귤고르기

class tangerine {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        //배열 tangerine을 map에 저장
        Map map = new HashMap<>();
        for(int i = 0; i<tangerine.length; i++){
            if (map.containsKey(Integer.toString(tangerine[i]))){
                int count = (int) map.get(Integer.toString(tangerine[i]));
                map.put(Integer.toString(tangerine[i]),count+1);
            }else{
                map.put(Integer.toString(tangerine[i]),1);
            }
        }

        // 내림차순 정렬
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<String,Integer>>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        // 리스트 출력
        // for(Entry<String,Integer> entry : list){
        //     System.out.println(entry.getKey()+":"+entry.getValue()); 
        // }       
        
        // k만큼 판매할때 몇가지의 경우가 최소인지 계산
        int i = 0;
        while(k > 0){
            k -= list.get(i).getValue();
            answer += 1;
            i++;
        }
        return answer;
    }
   
    public static void main(String[] args) {
        int[] tangerine = {3,3,3,2,1,4,2,4,5,3,2,2};

        System.out.println("answer : "+solution(9,tangerine));
    }
}