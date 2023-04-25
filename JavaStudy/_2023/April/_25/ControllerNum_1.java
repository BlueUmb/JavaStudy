package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181926
public class ControllerNum_1 {
    public static int solution(int n, String control) {
        int answer = n;
        String[] strArr = control.split("");

        for(String str : strArr){
            switch(str){
                case "w":
                    answer++;
                    break;
                case "s":
                    answer--;
                    break;
                case "d":
                    answer+=10;
                    break;
                case "a":
                    answer-=10;
                    break;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }
}
