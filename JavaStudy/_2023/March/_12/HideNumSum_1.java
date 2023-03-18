package _2023.March._12;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120851
public class HideNumSum_1 {
    public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");
        String num = "0123456789";

        for(String s : str ){
            if(num.contains(s)){
                answer+=Integer.parseInt(s);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }
}
