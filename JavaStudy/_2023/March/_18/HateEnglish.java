package _2023.March._18;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120894
public class HateEnglish {
    public static long solution(String numbers) {
        String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i =0; i<10; i++){
            numbers = numbers.replace(numString[i], String.valueOf(i));
        }
        
        return Long.valueOf(numbers);
    }
    public static void main(String[] args) {
        System.out.println(solution("onefourzerosixseven"));
    }
}
