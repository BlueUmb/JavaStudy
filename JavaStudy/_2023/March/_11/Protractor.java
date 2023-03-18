package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120829
public class Protractor {
    public static int solution(int angle) {
        int answer = 0;
        
        if(angle < 90){
            answer = 1;
        }else if(angle == 90){
            answer = 2;
        }else if(angle < 180){
            answer = 3;
        }else{
            answer = 4;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(180));
    }
}
