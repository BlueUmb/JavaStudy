package _2023.March._16;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120885
public class BinarySum {
    public static String solution(String bin1, String bin2) {
        String answer = "";
        int num1=0, num2=0;

        for(int i=0; i<bin1.length(); i++){
            num1 += Integer.parseInt(String.valueOf(bin1.charAt(i))) * Math.pow(2, bin1.length()-i-1); 
        }
        for(int i=0; i<bin2.length(); i++){
            num2 += Integer.parseInt(String.valueOf(bin2.charAt(i))) * Math.pow(2, bin2.length()-i-1); 
        }

        answer = Integer.toBinaryString(num1+num2);

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("10","1111"));
    }
}
