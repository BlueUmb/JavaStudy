package _2023.March._20;

import java.util.Arrays;

//Lv1
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1String = new String[n];
        String[] arr2String = new String[n];

        int i=0;
        for(int num : arr1){
            if(Integer.toBinaryString(num).length()==n){
                arr1String[i] = Integer.toBinaryString(num);
            }
            else{
                for(int re = 0; re<(n-Integer.toBinaryString(num).length()); re++){
                    if(arr1String[i] == null){
                        arr1String[i]="0";
                    }else{
                        arr1String[i]+="0";
                    }
                }
                arr1String[i]+=Integer.toBinaryString(num);
            }
            i++;
        }

        

        i=0;
        for(int num2 : arr2){
            if(Integer.toBinaryString(num2).length()==n){
                arr2String[i] = Integer.toBinaryString(num2);
            }
            else{
                for(int re = 0; re<n-Integer.toBinaryString(num2).length(); re++){
                    if(arr2String[i] == null){
                        arr2String[i]="0";
                    }else{
                        arr2String[i]+="0";
                    }
                }
                arr2String[i]+=Integer.toBinaryString(num2);
            }
            i++;
        }
    
        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                if(arr1String[j].charAt(k) == '1' || arr2String[j].charAt(k) =='1'){
                    if(answer[j] == null){
                        answer[j]="#";
                    }else{
                        answer[j]+="#";
                    }
                }else{
                    if(answer[j] == null){
                        answer[j]=" ";
                    }else{
                        answer[j]+=" ";
                    }
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(5, arr1, arr2)));
    }
}
