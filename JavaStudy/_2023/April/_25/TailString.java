package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181841
public class TailString {
    public static String solution(String[] str_list, String ex) {
        String answer = "";

        for(String str : str_list){
            if(!str.contains(ex)){
                answer += str;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        System.out.println(solution(str_list, "ef"));
    }
}
