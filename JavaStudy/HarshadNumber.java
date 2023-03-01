
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class HarshadNumber {
    public static boolean solution(int x) {
        boolean answer = true;
        int count = Integer.toString(x).length();
        int sum =0;

        for(int i=0; i<count; i++){
            sum += Integer.toString(x).charAt(i) -'0' ;
        }
       

        if(x%sum!=0){
            answer = false;
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(500));
    }
}
