package _2023.March._09;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12926
//ASCII 값에 따라 z , Z를 넘어갈시 -26으로 계산
//추가로 n의 값에따라 문자가 대문자-> 소문자가 되어 계산되는경우가 있어 문자의 대소문자 구분이 필요하였음
public class CaesarCipher {
    public static String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                if(s.charAt(i) >= 97){
                    answer += (s.charAt(i) + n) > 122 ? (char)(s.charAt(i)+n-26) : (char)(s.charAt(i)+n) ;
                }else{
                    answer += (s.charAt(i) + n) > 90 ? (char)(s.charAt(i)+n-26) : (char)(s.charAt(i)+n) ;
                }
                
            }else{
                answer += ' ';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Z", 25));
    }
    
}
