package _2023.until_March_06;

class bracket {
    static boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        char ex;
        
        for(int i=0; i<s.length(); i++){
            ex = s.charAt(i);
            if(ex == '('){
                count+=1;
            }else if(ex == ')'){
                if(count!=0){
                    count-=1;
                }
            }
        }
        
        if(s.charAt(0) == ')'){
            answer = false;
        }else if(count==0){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("((())()"));
    }
}