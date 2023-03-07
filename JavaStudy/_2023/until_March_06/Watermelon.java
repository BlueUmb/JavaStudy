package _2023.until_March_06;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Watermelon {
    public static String solution(int n) {
        String answer = "";

        for(int i=0; i<n; i++){
            if(i%2==0){
                answer+="수";
            }else{
                answer+="박";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
