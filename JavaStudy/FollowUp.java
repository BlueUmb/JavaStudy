import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class FollowUp {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        double count = 1;
        String[] usedword = new String[words.length];
        usedword[0] = words[0];

        for(int i = 1; i<words.length; i++){
            count++;

            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1) || Arrays.asList(usedword).contains(words[i])){
                answer[0] = (int)count % n == 0 ? n : (int)count % n ;
                answer[1] = (int)Math.ceil(count / n);
                break;
            }else{
                usedword[i] = words[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"aba", "aba"};//{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};//{"hello", "one", "even", "never", "now", "world", "draw"};//{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] answer = solution(2,words);
        for(int a : answer){
            System.out.println(a);
        }
    }
}
