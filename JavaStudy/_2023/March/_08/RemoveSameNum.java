package _2023.March._08;

import java.util.Stack;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class RemoveSameNum {
    public static int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<Integer>();

        for(int num : arr){
            if(stack.isEmpty()){
                stack.push(num);
            }else if(stack.peek() != num) {
                stack.push(num);
            }
        }
        
        answer = new int[stack.size()];

        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1,1,3,3,0,1,1};//{4,4,4,3,3};//
        int[] answer = solution(a);
        
        for(int num : answer){
            System.out.println(num);
        }
    }
}
