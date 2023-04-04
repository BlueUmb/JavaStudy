package _2023.April._04;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class MakePrimeNum {
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    boolean checkPrimeNum = false;
                    int sum = nums[i]+nums[j]+nums[k];
                    for(int l = 2; l<=Math.sqrt(sum); l++){
                        if(sum%l==0){
                            checkPrimeNum = true;
                            break;
                        }
                    }
                    if(!checkPrimeNum){
                        answer++;
                    }
                }
            }
        } 
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }
}
