package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181864
public class FindStrAndChange {
    public static int solution(String myString, String pat) {
        String[] strArr = myString.split("");
        myString="";

        for(String str : strArr){
            if(str.equals("A")){
                myString+="B";
            }else{
                myString+="A";
            }
        }

        return myString.contains(pat) ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution("ABBAA","AABB"));
    }
}
