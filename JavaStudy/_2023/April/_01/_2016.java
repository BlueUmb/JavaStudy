package _2023.April._01;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class _2016 {
    public static String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sumDay = 0; 

        for(int i=0; i<a-1; i++){
            sumDay += month[i];
        }

        switch ((sumDay+b-1)%7){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer =  "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}
