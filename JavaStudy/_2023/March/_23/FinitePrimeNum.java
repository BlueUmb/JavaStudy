package _2023.March._23;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120878
public class FinitePrimeNum {
    public static int solution(int a, int b) {
        b = b/gcd(a, b);
        
        while(b!=1){
            if(b%2==0){
                b/=2;
            }else if(b%5==0){
                b/=5;
            }else{
                return 2;
            }
        }

        return 1;
    }

    public static int gcd(int p, int q)
    {
       if (q == 0) return p;
       return gcd(q, p%q);
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 20));
    }
}
