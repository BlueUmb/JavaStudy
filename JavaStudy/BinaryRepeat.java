//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class BinaryRepeat {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount=0, count=0;
        
        while(!s.equals("1")){
            String num = "";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    num += s.charAt(i);
                }else{
                    zeroCount++;
                }
            }
            
            s = Integer.toBinaryString(num.length()).toString();

            count++;
        }

        answer[0] = count;
        answer[1] = zeroCount;

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution("110010101001");

        for(int num : answer){
            System.out.println(num);
        }
    }
}
