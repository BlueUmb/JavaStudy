package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181915
public class ConcatCharToString {
    public static String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int num : index_list){
            answer += my_string.charAt(num);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(solution("cvsgiorszzzmrpaqpe", index_list));
    }
}
