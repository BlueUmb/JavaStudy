package _2023.March._24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120880
public class UniqueSort {
    public static int[] solution(int[] numlist, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int num : numlist){
           list.add(num);
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int ob1 = Math.abs(n-o1);
                int ob2 = Math.abs(n-o2);

                if(ob1 == ob2){
                    if(o1 > o2){//음수일경우 변경 X
                        return -1;
                    }
                    else{//양수일경우 변경
                        return 1;
                    }
                }else{
                    return ob1 - ob2;
                }
            }
        });

        return list.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] num = {600, 400, 300, 200, 700, 800, 100, 900};//{1, 2, 3, 4, 5, 6};//{10000,20,36,47,40,6,10,7000};
        System.out.println(Arrays.toString(solution(num, 500)));
    }
}
