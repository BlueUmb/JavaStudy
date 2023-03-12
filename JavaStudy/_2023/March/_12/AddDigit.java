package _2023.March._12;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120906
public class AddDigit {
    public static int solution(int n) {
        int answer = 0;
        String[] str = String.valueOf(n).split("");
        
        for(String s : str){
            answer += Integer.parseInt(s);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(930211));
    }
}
