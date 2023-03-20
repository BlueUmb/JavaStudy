package _2023.until_March_06;

public class Reversenum {
    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int i=0;

        while(true){
            answer[i] = (int) (n%10);
            if(n<10){
                break;
            }
            n/=10;
            i++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = new int[10];
        answer = solution(1234567890);

        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
