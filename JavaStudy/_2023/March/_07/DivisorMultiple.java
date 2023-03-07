package _2023.March._07;

/*
 * 최소 공배수 = 두수의 곱 / 최대공약수
 * 최대 공약수 = 유클리드 호제법 이용
 * public static int gcd(int p, int q)
   {
       if (q == 0) return p;
      return gcd(q, p%q);
   }
 */
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class DivisorMultiple {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];

        return answer;
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }

    public static void main(String[] args) {
        int[] answer = solution(3,12);

        for(int num : answer){
            System.out.println(num);
        }
    }
}
