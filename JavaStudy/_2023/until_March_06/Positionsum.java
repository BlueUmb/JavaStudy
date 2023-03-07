package _2023.until_March_06;

public class Positionsum {
    public static int solution(int n) {
        int answer = 0;
        int length = String.valueOf(n).length();
        
        if(length == 1){
            return answer = n;
        }else{
            for(int i=0; i<length; i++){
                answer += n % 10;
                n /= 10;
            }
        }
    
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1234));
    }
}
