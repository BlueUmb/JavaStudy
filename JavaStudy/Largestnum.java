//보류 //asdf


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// public class Largestnum {

//     static ArrayList<String> numberlist = new ArrayList<>();
    
//     //문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42746?language=java
//     public static String solution(int[] numbers) {
//         String answer = "";

//         perm(numbers, 0, numbers.length, numbers.length);

//         Collections.sort(numberlist,Comparator.reverseOrder());

//         answer = numberlist.get(0);

//         return answer;
//     }

//     public static void perm(int[] arr, int depth, int n, int r) {
//         String number = "";
        
//         if (depth == r) { 
//             for(int i=0; i<arr.length; i++){
//                 number += arr[i];
//             }
//             numberlist.add(number);
//             return;
//         }

//         for (int i = depth; i < n; i++) {
//             swap(arr, i, depth);
//             perm(arr, depth + 1, n, r);
//             swap(arr, i, depth);
//         }
//     }

//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] numbers = {6,10,2};
//         System.out.println(solution(numbers));
//     }
// }
