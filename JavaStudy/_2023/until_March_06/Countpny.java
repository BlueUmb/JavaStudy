package _2023.until_March_06;

class Countpny{

    static boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==(int)'p' || s.charAt(i)==(int)'P'){
                count++;
            }else if(s.charAt(i)==(int)'y' || s.charAt(i)==(int)'Y'){
                count--;
            }
        } 

        if(count == 0){
            return answer;
        }
        else{
            return !answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("pppa"));
    }
}