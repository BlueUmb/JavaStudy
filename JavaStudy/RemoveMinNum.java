//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class RemoveMinNum {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int i=0;
        if(arr.length>1){
            for(int num : arr){
                min = Math.min(min, num);
            }
            for(int num : arr){
                if(num != min){
                    answer[i] = num;
                    i++;
                }
            }
        }else{
            answer = new int[] {-1};
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num = {4,3,2,1};
        int[] answer = solution(num);

        for(int answernum : answer){
            System.out.println(answernum);
        }
    }
}
