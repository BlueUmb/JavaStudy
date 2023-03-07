package _2023.until_March_06;

public class Cutpaper{
    public static int solution(int M, int N) {
        return (M - 1) + ((N - 1) * M);
    }

    public static void main(String[] args) {
        System.out.println(solution(1,1));
    }
}