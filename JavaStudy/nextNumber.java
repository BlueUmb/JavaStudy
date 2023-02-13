public class nextNumber {

    public static int solution(int[] common) {
        int answer = 0;
        
        if(common[2] - common[1] == common[1] - common[0] ){
            answer = common[common.length-1] + common[2] - common[1];
        }else{
            answer = common[common.length-1] * (common[1] / common[0]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 8};
        System.out.println(solution(a));
    }
}
