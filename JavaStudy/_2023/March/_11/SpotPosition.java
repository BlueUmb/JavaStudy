package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120841
public class SpotPosition {
    public static int solution(int[] dot) {
        int answer = 0;

        if(dot[0] > 0){
            if(dot[1] > 0){
                answer = 1;
            }else{
                answer = 4;
            }
        }else{
            if(dot[1] > 0){
                answer = 2;
            }else{
                answer = 3;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {2, 4};
        System.out.println(solution(a));
    }
}
