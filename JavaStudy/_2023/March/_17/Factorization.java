package _2023.March._17;

import java.util.ArrayList;
import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120852
public class Factorization {
    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=1;

        while(n!=1){
            i++;
            if(n%i==0){
                if(!list.contains(i))
                {
                    list.add(i);
                }
                n /= i;
                i=1;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(420)));
    }
}
