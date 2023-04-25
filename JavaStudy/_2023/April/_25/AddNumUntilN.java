package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class AddNumUntilN {
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers){
            if(answer>n){
                break;
            }
            answer+=num;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        System.out.println(solution(numbers, 123));
    }
}
