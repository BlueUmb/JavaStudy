import java.util.Arrays;
import java.util.Collections;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class NumberSort {
    public static long solution(long n) {
        long answer = 0;
        String num = String.valueOf(n);
        Integer[] arr = new Integer[num.length()];

        for(int i=0; i<num.length(); i++){
            arr[i] = Integer.parseInt(num.substring(i, i+1));
        }

        Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            answer += (arr[i] * Math.pow(10, arr.length-i-1));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
