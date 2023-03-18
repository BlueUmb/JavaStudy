package _2023.March._12;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120837
public class AntCorps {
    public static int solution(int hp) {
        int answer = 0;

        if(hp/5!=0){
            answer += hp/5;
            hp %= 5;
        }
        if(hp/3!=0){
            answer += hp/3;
            hp %= 3;
        }
        answer += hp/1;
        hp %= 1;
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(999));
    }
}
