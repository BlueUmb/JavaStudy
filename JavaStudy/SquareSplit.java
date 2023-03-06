//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/87390
public class SquareSplit {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        
        for(int i=0; i<right-left+1; i++){
            answer[i] = (int) Math.max((left+i)/n, (left+i)%n)+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(3,2,5);

        for(int num : answer){
            System.out.println(num);
        }
    }
}
