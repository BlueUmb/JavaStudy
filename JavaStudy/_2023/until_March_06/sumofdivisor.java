package _2023.until_March_06;

class sumofdivisor{
    public static int solution(int left, int right) {
        int answer = 0;
        int num = left;

        while(num <= right){
            int count = 0;

            //약수갯수 확인
            for(int i=1; i<right+1; i++){
                if(num % i == 0){
                    count++;
                }
            }

            //약수 갯수에 따른 덧셈
            if(count%2 == 0){
                answer+=num;
            }else{
                answer-=num;
            }

            num++;
        }
        return answer;
    }
}