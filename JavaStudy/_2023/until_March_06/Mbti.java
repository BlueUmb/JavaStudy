package _2023.until_March_06;

import java.util.HashMap;
import java.util.Map;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Mbti {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map mbti = new HashMap<>();
        
        // Map에 Default값으로 RT,CF,JM,AN의 키값으로 value = 0 초기화
        mbti.put("RT", 0);
        mbti.put("CF", 0);
        mbti.put("JM", 0);
        mbti.put("AN", 0);

        for(int i=0; i<choices.length; i++){    //choices의 길이와 survey의 길이는 같으므로 choice의 길이만큼 반복
            
            //TR,FC,MJ,NA처럼 반대로 되어있는 경우 if문 진입
            if(survey[i].equals("TR")||survey[i].equals("FC")||survey[i].equals("MJ")||survey[i].equals("NA")){
                //survey의 종류중에 RT->TR처럼 거꾸로 되어있는경우 choices의 값이 반대로 적용되므로 TR을 RT로 키값을 변경하기 
                String reverse = String.valueOf(survey[i].charAt(1)) + survey[i].charAt(0);
                
                //기존에 있던 value값을 가져와서 저장
                int value = (int) mbti.get(reverse);
                
                //기존에 있던 value값 + 현재의 value값에 반대로 적용(-1을 곱하여 반대로 적용)
                value += (choices[i]-4)*(-1);
                
                //map에 해당 값을 다시 put
                mbti.put(reverse, value);
            }else{
                //해당 key값에 value를 그대로 적용
                int value = (int) mbti.get(survey[i]);
                value += (choices[i]-4);
                mbti.put(survey[i], value);
            }
        }

        //map에 각 키값에 할당되어 있는 value가 0보다 작거나 같으면 앞에있는 글자가 mbti가 되므로
        //삼항연산자 사용하여 answer에 추가
        answer += ((int) mbti.get("RT") <= 0 ? "R" : "T");
        answer += ((int) mbti.get("CF") <= 0 ? "C" : "F");
        answer += ((int) mbti.get("JM") <= 0 ? "J" : "M");
        answer += ((int) mbti.get("AN") <= 0 ? "A" : "N");

        return answer;
    }
    

    public static void main(String[] args) {
        String[] survey = {"TR", "RT", "TR"};//{"AN","CF","MJ","RT","NA"};
        int[] choice = {4, 4, 4};//{5,3,2,7,5};
        System.out.println(solution(survey,choice));
    }
}
