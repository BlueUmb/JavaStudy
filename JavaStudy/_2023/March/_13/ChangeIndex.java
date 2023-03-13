package _2023.March._13;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120895
public class ChangeIndex {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");

        for(int i=0; i<strArr.length; i++){
            if(i==num1){
                answer += strArr[num2];
            }
            else if(i==num2){
                answer += strArr[num1];
            }
            else{
                answer += strArr[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
    }
}
