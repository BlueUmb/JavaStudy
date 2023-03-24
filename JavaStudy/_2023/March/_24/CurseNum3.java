package _2023.March._24;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120871
public class CurseNum3 {
    public static int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            answer+=1;
            while(true){
                if((answer)%3 == 0 || String.valueOf(answer).contains("3")){
                    answer+=1;
                }else{
                    break;
                }           
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(40));
    }
}
