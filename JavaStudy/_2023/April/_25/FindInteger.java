package _2023.April._25;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181840
public class FindInteger {
    public static int solution(int[] num_list, int n) {
        Arrays.sort(num_list);
        return Arrays.binarySearch(num_list, n) < 0 ? 0 : 1;
    }
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(solution(num_list, 3));
    }
}
