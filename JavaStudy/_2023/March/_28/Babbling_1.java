package _2023.March._28;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120956
public class Babbling_1 {
    public static int solution(String[] babbling) {
        int answer = 0;

        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");

            babbling[i] = babbling[i].replace(" ", "");
            
            if(babbling[i].isEmpty()){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};//{"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));
    }
}
