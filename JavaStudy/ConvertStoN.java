//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12925
public class ConvertStoN {
    public static int solution(String s) {
        int answer = 0;
        if(s.startsWith("-")){
            answer = Integer.valueOf(s);
        }else{
            answer = Integer.valueOf(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-121"));
    }
}
