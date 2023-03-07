package _2023.until_March_06;

public class Password {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        char letter;
        char nextletter;

        for(int i=0; i<s.length(); i++){
            int count=0;
            letter = s.charAt(i);

            while(count<index){
                if(letter+1 > 122){
                    nextletter = (char)97;
                }else{
                    nextletter = (char)(letter+1);
                }

                if(skip.contains(String.valueOf(nextletter))){
                    letter = nextletter;
                }
                else{
                    letter = nextletter;
                    count++;
                }
            }
            
            answer += (char)(letter);
            
        }

        return answer;
    }
    public static void main(String[] args) {
        String answer = solution("ayd","wbqe",8);
        System.out.println(answer);
    }
}
