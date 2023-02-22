import java.util.Arrays;
import java.util.Collections;


//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42746?language=java
//H-index 설명 : https://en.wikipedia.org/wiki/H-index
public class Hindex {
    public static int solution(int[] citations) {
        int answer = 0;
        Integer[] copycitations = new Integer[citations.length];

        //int형 배열을 Integer형 배열로 변환 
        //(변환 이유 : 내림차순으로 정렬하기위해 Collection.reverseOrder()을 이용하는데 int형에서는 안되고Integer자료형에서 사용할수있기 때문)
        for(int i=0; i<citations.length; i++){
            copycitations[i] = Integer.valueOf(citations[i]);
        }
        
        //배열 copycitations를 내리림차순으로 정렬
        Arrays.sort(copycitations,Collections.reverseOrder());

        //H-index를 찾기 전 하나도 인용되지않았을 경우를 체크하여 0 반환
        if(copycitations[0]== 0){
            return 0;
        }

        //H-index는 배열의 index가 해당 index의 데이터이상↑이 되는 index값이다.
        //예 : [10,8,5,3,3] = 3 / [10,8,5,4,3] = 4
        for(int i=0; i<copycitations.length; i++){
            if(i >= copycitations[i]){
                answer = i;
                break;
            }
        }
        //만약 배열전체를 비교했을때 H-index가 찾아지지 않는경우
        //H-index는 배열의길이
        //예 : [10,10,10,10,10] = 5
        if (answer==0){
            answer = copycitations.length;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {10,10,10,10,6};
        System.out.println(solution(citations));
    }
    
}
