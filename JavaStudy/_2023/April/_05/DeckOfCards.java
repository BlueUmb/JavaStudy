package _2023.April._05;

import java.util.ArrayList;
import java.util.Arrays;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class DeckOfCards {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(cards1));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(cards2));

        for(int i=0; i<goal.length; i++){
            if(!list1.isEmpty() && goal[i].equals(list1.get(0))){
                list1.remove(0);
            }else if(!list2.isEmpty() && goal[i].equals(list2.get(0))){
                list2.remove(0);
            }else{
                answer = "No";
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};//{"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }
}
