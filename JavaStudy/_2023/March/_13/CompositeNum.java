package _2023.March._13;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120846
public class CompositeNum {
    public static int solution(int n) {
        int answer = 0;
        int count = 0;

        for(int i=1; i<=n; i++){
            count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>=3){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
