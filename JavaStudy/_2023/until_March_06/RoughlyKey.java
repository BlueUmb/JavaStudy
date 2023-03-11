package _2023.until_March_06;

import java.util.HashMap;
import java.util.Map;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class RoughlyKey {

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        //keymap에 담긴 값중 최소 경우의수를 구하기위한 반복문
        for(int i=0; i<keymap.length; i++){ //keymap의 전체 갯수만큼반복
            for(int j=0; j<keymap[i].length(); j++){ //keymap[i](String)의 길이만큼 반복 
                char key = keymap[i].charAt(j); //keymap[i]의 한글자씩 추출
                int value = j+1;    //한글자의 인덱스
                if(map.containsKey(key)){   //만약 key가 map에 이미 들어가있을경우 if문진입
                    value = Math.min((int) map.get(key), value);    //map에 들어가있는 값과 새로 추출한 값중 작은수를 value로 설정
                }
                map.put(key, value);    //map에 key와 value를 저장
            }
        }
        
        for(int i=0; i<targets.length; i++){ //targets의 전체 갯수만큼반복
            for(int j=0; j<targets[i].length(); j++){ //targets[i](String)의 길이만큼 반복 
                char key = targets[i].charAt(j); //targets[i]의 한글자씩 추출
                if(map.containsKey(key)){ //만약 key가 map에 들어가있을경우 if문진입
                    answer[i] += (int)map.get(key); //answer배열에 value값 입력
                }
                else{  //key가 없을경우 진입
                    answer[i] = -1; //key가없으면 만들수없는 문자이므로 -1넣은후 반복문 중단
                    break;
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        String[] key = {"ABACD", "BCEFD"};//{"AGZ", "BSSS"};//{"AA"};//{"ABACD","BCEFD"};
        String[] target = {"XABCD", "AABB"};//{"ASA","BGZ"};//{"B"};//{"ABCD","AABB"};
       
        int[] answer = solution(key, target);

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
