package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class FirstNegativeNum {
    public static int solution(int[] num_list) {
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]<0){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        System.out.println(solution(num_list));
    }
}
