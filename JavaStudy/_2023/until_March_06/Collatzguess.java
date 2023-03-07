package _2023.until_March_06;

public class Collatzguess {
    
    public static int solution(int num) {
        int answer = 0;
        long longnum = num;

        while(answer<=500 && longnum != 1){
            if(longnum % 2 == 0){
                longnum /= 2;
                answer++;
            }else{
                longnum = (longnum * 3) + 1;
                answer++;
            }
        }

        if(answer>500){
            answer = -1;
        }
       
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(17));
    }
}
