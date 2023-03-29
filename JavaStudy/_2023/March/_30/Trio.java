package _2023.March._30;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131705
public class Trio {
    public static int solution(int[] number) {
        int answer = 0;

        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num = {-3, -2, -1, 0, 1, 2, 3};//{-2, 3, 0, 2, -5};
        System.out.println(solution(num));
    }
}
