package _2023.March._14;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120838
public class MorseCode {
    public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] strArr = letter.split(" ");
        int count=0; 

        for(String str : strArr){
            count = 0;
            for(String code : morse){
                if(!code.equals(str)){
                    count++;
                }else{
                    answer += (char)(count+97);
                    break;
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
