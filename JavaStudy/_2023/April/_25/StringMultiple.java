package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181940
public class StringMultiple {
    public static String solution(String my_string, int k) {
        String answer = "";
        
        for(int i=0; i<k; i++){
            answer += my_string;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("string", 3));
    }
}
