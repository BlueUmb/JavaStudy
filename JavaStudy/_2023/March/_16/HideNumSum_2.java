package _2023.March._16;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120864
public class HideNumSum_2 {
    public static int solution(String my_string) {
        int answer = 0;
        my_string += "A";

        String num = "";

        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)-58 < 0){
                num += my_string.charAt(i);
            }else if(my_string.charAt(i)>0 && !num.equals("")){
                answer += Integer.valueOf(num);
                num = "";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }
}
