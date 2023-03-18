package _2023.March._11;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120830
public class LambSkewers {
    public static int solution(int n, int k) {
        int answer = 0;

        answer += n * 12000;

        if(n >= 10){
            answer += (k - (n / 10)) * 2000 ;
        }else{
            answer += k * 2000;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(64,6));
    }
}
