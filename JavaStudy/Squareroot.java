//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Squareroot {
    public static long solution(long n) {
        if(Math.sqrt(n)%1==0){
            long num = (long) Math.sqrt(n);
            return (num+1)*(num+1);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }

}
