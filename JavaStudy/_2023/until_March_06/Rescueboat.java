package _2023.until_March_06;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Rescueboat {

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>(500000);

        //people배열 정렬후 deque에 저장
        Arrays.sort(people);
        for(int i=0; i<people.length; i++){
            deque.add(people[i]);
        }
        
        //deque에 값이 있을때 반복실행
        while(!deque.isEmpty()){
            int weight = deque.pollLast();  //deque의 마지막값을 제거한후 제거한 값을 반환
            if(!deque.isEmpty() && weight + deque.peekFirst() <= limit){
                deque.pollFirst();  //deque의 첫번째 값을 제거한후 제거한 값을 반환
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70,80,50};
        System.out.println(solution(people, 100));
    }
}
