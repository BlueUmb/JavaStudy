package _2023.March._17;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120912
public class CountSeven {
    public static int solution(int[] array) {
        int answer = 0;

        for(int num : array){
            for(int i=0; i<String.valueOf(num).length(); i++){
                if(String.valueOf(num).charAt(i) == '7'){
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {7, 77, 17};
        System.out.println(solution(a));
    }
}
