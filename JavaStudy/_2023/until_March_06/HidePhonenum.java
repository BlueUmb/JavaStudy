package _2023.until_March_06;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class HidePhonenum {
    public static String solution(String phone_number) {
        String answer = "";

        for(int i=0; i<phone_number.length()-4;i++){
            answer+="*";
        }
        answer+=phone_number.substring(phone_number.length()-4,phone_number.length());
    
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("01033334444").length());
    }
}
