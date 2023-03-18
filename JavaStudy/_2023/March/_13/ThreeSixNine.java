package _2023.March._13;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120891
public class ThreeSixNine {
    public static int solution(int order) {
        int answer = 0;
        String[] strArr = String.valueOf(order).split("");

        for(String num : strArr){
            if(num.equals("3") || num.equals("6") || num.equals("9")){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(29423));
    }
}
