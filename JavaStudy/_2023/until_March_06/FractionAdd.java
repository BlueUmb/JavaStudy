package _2023.until_March_06;

class FractionAdd{

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        int bottom = denom1 * denom2;
        int top = (numer1 * denom2) + (numer2 * denom1);
        int max = Euclidean(top,bottom);

        // int i=2;
        // while(true){
        //     System.out.println(top+"="+bottom);
        //     if(top%i==0 && bottom%i==0){
        //         top /= i;
        //         bottom /= i;
        //         i=2;
        //     }
            
        //     if(i<Math.min(top, bottom)){
        //         i++;
        //     }else{
        //         if(Math.min(top, bottom)==2){
        //             i=2;
        //         }else{
        //             break;
        //         }
        //     }
        // }

        answer[0] = top/max;
        answer[1] = bottom/max;

        return answer;
    }

    public static int Euclidean(int a, int b) {
        if (b == 0)
            return a;
        return Euclidean(b, a % b);
    }

    public static void main(String[] args) {
        int[] answer = solution(1,2,1,2);
        System.out.println(answer[0]+"/"+answer[1]);
        //System.out.println(answer[0] + " "+ answer[1]);
    }
}