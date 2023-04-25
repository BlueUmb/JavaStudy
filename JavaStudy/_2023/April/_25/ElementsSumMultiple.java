package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class ElementsSumMultiple {
    public static int solution(int[] num_list) {
        int multiple = 1;
        int sum = 0;

        for(int num : num_list){
            multiple*=num;
            sum += num;
        }

        return Math.pow(sum, 2) > multiple ? 1 : 0;
    }
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}
