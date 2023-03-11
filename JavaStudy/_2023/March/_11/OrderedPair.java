package _2023.March._11;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120836
public class OrderedPair {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(20));
    }
}
