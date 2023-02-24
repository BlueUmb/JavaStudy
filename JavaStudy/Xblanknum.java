//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class Xblanknum {
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i<n; i++){
            answer[i] = (i+1)*x;
        }
        return answer;
    }

    public static void main(String[] args) {
        long[] answer = new long[3];

        answer = solution(4, answer.length);

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);     
        }
           
    }
}
