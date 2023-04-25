package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class ReturnValueByOddEven {
    public static int solution(int n) {
        int answer = 0;

        if(n%2==0){
            for(int i=2; i<=n; i+=2){
                answer += Math.pow(i, 2);
            }
        }else{
            for(int i=1; i<=n; i+=2){
                answer += i;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}
