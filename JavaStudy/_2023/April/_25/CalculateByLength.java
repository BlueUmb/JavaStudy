package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class CalculateByLength {
    public static int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length >= 11){
            for(int num : num_list){
                answer += num;
            }
        }
        else{
            answer = 1;
            for(int num : num_list){
                answer *= num;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        System.out.println(solution(num_list));
    }
}
