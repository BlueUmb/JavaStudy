package _2023.March._12;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120893
public class CapitalSamllLetter {
    public static String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>=97){
                answer += (char)(my_string.charAt(i) - 32);
            }else{
                answer += (char)(my_string.charAt(i) + 32);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("aA"));
    }
}
