package _2023.March._22;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
public class LoginSuccess {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for(String[] userData : db){
            if(id_pw[0].equals(userData[0])){
                answer = id_pw[1].equals(userData[1]) ? "login" : "wrong pw" ;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        String[] user = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(user, db));
    }
}
