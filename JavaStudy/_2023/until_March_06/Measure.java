package _2023.until_March_06;

import java.util.ArrayList;
import java.util.Comparator;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120897
public class Measure {
    public static ArrayList solution(int n) {
        ArrayList answer = new ArrayList<>();

        int middle = (int) Math.sqrt(n);

        for(int i=1; i<=middle; i++){
            if(n%i==0){
                answer.add(i);
                if(n/i != i){
                    answer.add(n/i);
                }
            }
        }

        answer.sort(Comparator.naturalOrder());

        return answer;
    }

    public static void main(String[] args) {
        ArrayList answer = solution(25);

        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
