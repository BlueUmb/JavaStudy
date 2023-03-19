package _2023.March._17;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120843
public class ThrowBall {
    public static int solution(int[] numbers, int k) {
        int i=0;
        while(k!=1){
            if(i+2 <numbers.length){
                i+=2;
            }else{
                i = i+2 - numbers.length;
            }
            k--;
        }

        return numbers[i];
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(a, 5));
    }
}
