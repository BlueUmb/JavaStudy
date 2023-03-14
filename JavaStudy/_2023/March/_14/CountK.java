package _2023.March._14;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120887
public class CountK {
    public static int solution(int i, int j, int k) {
        int answer = 0;

        for(int start = i; start<=j; start++ ){
            String[] numArr = String.valueOf(start).split("");
            for(String num : numArr){
                if(num.equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10, 50, 5));
    }
}
