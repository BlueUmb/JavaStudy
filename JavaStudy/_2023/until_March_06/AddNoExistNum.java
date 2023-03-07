package _2023.until_March_06;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class AddNoExistNum {
    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        for(int i=0; i<10; i++){
            if(Arrays.binarySearch(numbers, i) < 0){
                answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num = {5,8,4,0,6,7,9};
        System.out.println(solution(num));
    }
}
