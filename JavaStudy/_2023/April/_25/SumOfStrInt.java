package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181849
public class SumOfStrInt {
    public static int solution(String num_str) {
        int answer = 0;
        String[] strArr = num_str.split("");

        for(String str : strArr){
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
    }
}
