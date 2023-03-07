package _2023.until_March_06;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class PositiveNegative {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i=0;

        for(int num : absolutes){
            if(signs[i]){
                answer += num;
            }else{
                answer -= num;
            }
            i++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        boolean[] sign ={false,false,true};
        System.out.println(solution(num,sign));
    }
}
