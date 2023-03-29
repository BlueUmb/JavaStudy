package _2023.March._30;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class NumStringAndWord {
    public static int solution(String s) {
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<num.length; i++){
            s=s.replace(num[i], String.valueOf(i));
        }

        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        String string = "one4seveneight";
        System.out.println(solution(string));
    }
}
