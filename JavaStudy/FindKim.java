import java.util.Arrays;
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class FindKim {
    public static String solution(String[] seoul) {
        String answer = "";

        //answer = "김서방은 "+Arrays.binarySearch(seoul,"Kim")+"에 있다";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }         
        }
        

        return answer;
    }

    public static void main(String[] args) {
        String[] answer = {"Jane","Zdh", "Kim","auy","ady"}; 
        System.out.println(solution(answer));
    }
}
