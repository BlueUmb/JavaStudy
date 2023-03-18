package _2023.March._18;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120853
public class CtrlZ {
    public static int solution(String s) {
        int answer = 0;
        String[] strArr = s.split(" ");

        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("Z")){
                answer -= Integer.parseInt(strArr[i-1]);
            }else{
                answer += Integer.parseInt(strArr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 Z"));
    }
}
