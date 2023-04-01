package _2023.April._01;

import java.util.ArrayList;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class FoodFight {
    public static String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);

        for(int i=food.length-1; i>0; i--){
            for(int j=0; j<food[i]/2; j++){
                list.add(0,i);
                list.add(i);
            }
        }

        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};//{1, 3, 4, 6};
        System.out.println(solution(food));
    }
}
