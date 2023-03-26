package _2023.March._26;

import java.util.Arrays;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
public class OXQuiz {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i=0;

        for(String question : quiz){
            int num = 0;
            int operator = 1;
            boolean result = false;
            for(String questionString : question.split(" ")){
                if(result){
                   answer[i] = questionString.equals(String.valueOf(num)) ? "O" : "X";
                }
                switch (questionString){
                    case "+":
                        operator = 1;
                        break;
                    case "-":   
                        operator = -1;
                        break;
                    case "=":
                        result = true;
                        break;
                    default:
                        num += operator * Integer.valueOf(questionString);
                }
            }
            i++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};//{"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }
}
