package _2023.March._13;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120904
public class FindNum {
    public static int solution(int num, int k) {
        int answer = -1;
        String[] strArr = String.valueOf(num).split("");

        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }
        }
    
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(232443, 4));
    }
}
