package _2023.March._20;

import java.util.ArrayList;

//에라토스테네스의 체를 사용하여 반복회수를 줄이기
//Lv1
//문제 링크 : 
public class FindPrimeNum {
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean check = false;

        for(int i=2; i<=Math.sqrt(n); i++){
            check = false;
            for(int j = 2; j<i; j++){
                if(i%j==0){
                    check = true;
                    break;
                }
            }
            if(!check){
                list.add(i);
            }
        }

        for(int i=2; i<=n; i++){
            check = false;
            for(int num : list){
                if(i%num==0 && !list.contains(i)){
                    check = true;
                    break;
                }
            }
            if(!check){
                answer++;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
