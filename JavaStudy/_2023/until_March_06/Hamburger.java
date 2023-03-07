package _2023.until_March_06;

import java.util.ArrayList;

//시간초과
//문제링크 : 
public class Hamburger {
    public static int solution(int[] ingredient) {
        int answer = 0;
        String burger="";
        for(int i=0; i<ingredient.length; i++){
            burger+=ingredient[i];
            if(burger.length()>=4 && burger.substring(burger.length()-4, burger.length()).equals("1231")){
                burger = burger.substring(0,burger.length()-4);
                answer++;
            }
        }

        // ArrayList burger = new ArrayList<>();

        // for(int i=0; i<ingredient.length; i++){
        //     burger.add(ingredient[i]);

        //     if(burger.size()>=4){
        //         for(int j=0; j<burger.size()-3; j++){
        //             if((int)burger.get(j)==1 && (int)burger.get(j+1)==2 && (int)burger.get(j+2)==3 && (int)burger.get(j+3)==1){
        //                 burger.remove(j+3);
        //                 burger.remove(j+2);
        //                 burger.remove(j+1);
        //                 burger.remove(j);
        //                 answer++;
        //             }
        //         }
        //     }
        // }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        
        System.out.println(solution(answer));
    }
}
