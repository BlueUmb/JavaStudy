package _2023.March._08;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12930
//문자열을 split을 이용하여 나눌때 split(" ",-1) -1을 넘겼을때 공백도 같이 넘기게됨
public class MakeOddString {
    public static String solution(String s) {
        String answer = "";
        String[] stringArr = s.split(" ",-1);

        for(String n : stringArr){
            System.out.println(n);
        }
        
        for(int i=0; i<stringArr.length; i++){
            for(int j=0; j<stringArr[i].length(); j++){
                if(j%2==0){
                   answer += String.valueOf(stringArr[i].charAt(j)).toUpperCase();
                }else{
                    answer += String.valueOf(stringArr[i].charAt(j)).toLowerCase();
                }
            }
            if(i!=stringArr.length-1){
                answer += " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = solution(" abc de  fghi  ");

        // for(int i=0; i<s.length(); i++)
        // System.out.println(s.charAt(i));
        
        System.out.println(s);
        
    }
}
