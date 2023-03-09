package _2023.March._09;

import java.util.Arrays;

//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12982
//전체 예산에서 많은 부서에게 예산을 지급하는 경우의수를 고르려면 예산을 작게 신청한 부서부터 주어지면 되므로
//Arrays.sort로 오름차순으로 정렬후 0번 인덱스부터 예산 지원하며 전체예산을 감소시킨다.
public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            if(budget-d[i]<0){
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {2,2,3,3};//{1,3,2,5,4};

        System.out.println(solution(d,10));
    }
    
}
