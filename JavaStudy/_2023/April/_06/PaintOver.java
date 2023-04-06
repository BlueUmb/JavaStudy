package _2023.April._06;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class PaintOver {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;

        for(int index : section){
            if(last< index){
                last = index+m-1;
                answer++; 
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] section = {2, 3, 15, 16};//{2, 3, 6};//{1, 3}; //{1, 2, 3, 4};
        System.out.println("answer : "+solution(16, 4, section));
    }
}
