package _2023.March._08;

import java.util.Stack;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68935
//스택을 이용하여 역순으로 뒤집는 과정을 스킵
public class ReverseTernary {
    public static int solution(int n) {
        int answer = 0;
        int time = 0;
        Stack<Integer> stack = new Stack<>();

        while(true){
            stack.push(n%3);   
            n /= 3;
            time++;
            if(n==0) break;
        }
        System.out.println(stack);

        for(int i = 0; i<time; i++){
            answer += Math.pow(3, i) * stack.pop();
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
