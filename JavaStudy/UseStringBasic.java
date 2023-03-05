//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class UseStringBasic {
    public static boolean solution(String s) {
        String num= "0123456789";
        System.out.println(s.length());
        if(s.length()==4 || s.length()==6){
            for(int i=0; i<s.length(); i++){
                if(!num.contains(String.valueOf(s.charAt(i)))){
                    return false;
                }
            }
        }
        else{
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }
}
