package _2023.April._25;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class NumConcat {
    public static int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for(int num : num_list){
            if(num%2==0){
                even += num;
            }else{
                odd += num;
            }
        }

        return Integer.parseInt(even)+Integer.parseInt(odd);
    }
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}
