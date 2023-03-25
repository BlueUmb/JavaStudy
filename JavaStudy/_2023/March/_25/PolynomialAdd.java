package _2023.March._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120863
public class PolynomialAdd {
    public static String solution(String polynomial) {
        
        String[] polynomailArr = polynomial.split(" ");
        int count = 0;
        int constant = 0;
        for(String s : polynomailArr){
            if(s.endsWith("x")){
                if(s.length()!=1){
                    count += Integer.valueOf(s.substring(0, s.length()-1));
                }else{
                    count += 1;
                }
            }else if(!s.equals("+")){
                constant += Integer.parseInt(s);
            }
        }

        //삼항연산자로 반환값 정리시 생략가능
        // String answer = "";
        // if(count == 0){
        //     answer = String.valueOf(constant);
        // }else if(constant == 0){
        //     if(count == 1){
        //         answer = "x";
        //     }else{
        //         answer = count+"x";
        //     }
        // }else{
        //     if(count == 1){
        //         answer = "x + "+constant;
        //     }else{
        //         answer = count+"x + "+constant;
        //     }
        // }

        return (count > 1 ? count+"x" : count > 0 ? "x" : "" ) + (count > 0 ? constant > 0 ? " + "+constant : "" : constant);
    }
    public static void main(String[] args) {
        System.out.println(solution("0"));
    }
}
