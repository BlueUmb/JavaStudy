package _2023.April._25;

import java.util.ArrayList;
import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181868
public class SeparateBySpace_2 {
    public static String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<String>();
        String[] strArr = my_string.split(" ");

        for(String str : strArr){
            if(!str.equals("")){
                list.add(str);
            }
        }

        return list.toArray(new String[list.size()]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(" i    love  you")));
    }
}
