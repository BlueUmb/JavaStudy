package _2023.April._07;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class TemplarWeapon {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int prime =0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    if(i/j == j){
                        prime++;
                    }else{
                        prime+=2;
                    }
                }
            }      

            if(prime > limit){
                answer += power;
            }else{
                answer += prime;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }
}
