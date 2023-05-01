package _2023.May._01;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181887
public class OddVSEven {
    public static int solution(int[] num_list) {
        int even = 0, odd = 0;

        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        
        return even < odd ? odd : even;
    }
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        System.out.println(solution(num_list));
    }
}
