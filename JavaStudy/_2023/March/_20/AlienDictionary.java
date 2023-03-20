package _2023.March._20;

//Lv0
//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120869
public class AlienDictionary {
    public static int solution(String[] spell, String[] dic) {
        for(int i=0;i<dic.length;i++){
            int answer = 0;
            for(int j=0;j<spell.length;j++){
                if(dic[i].contains(spell[j])) 
                {
                    answer ++;
                }
            }
            if(answer==spell.length){
                return 1;
            }
        }
        return 2;
    }
    public static void main(String[] args) {
        String[] array1 = {"s", "o", "m", "d"};
        String[] array2 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(solution(array1, array2));
    }
}
