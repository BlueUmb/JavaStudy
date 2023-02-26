//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120923
public class SumOfNum {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];   
        int start =  (total / num) - ((num - 1) / 2); 
        int j = 0;

        for(int i=start; i<start+num; i++){
            answer[j] = i;   
            j++;         
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(4, 14);

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
