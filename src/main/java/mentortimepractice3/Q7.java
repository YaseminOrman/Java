package mentortimepractice3;

import java.util.Arrays;
import java.util.HashMap;

public class Q7 {
    public static void main(String[] args) {

       // 7)Type code to print the number of occurrences of letters in a sentence( homework)
       // " I love Java. "    ==>  a=2, e=1, v=2, I=1, J=1, l=1, o=1

        String str = " I love Java. ";
        str=str.replaceAll("\\p{Punct}","").replaceAll("\\s","");
        String[] letters = str.split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String,Integer> hMap = new HashMap<>();
        for(String w : letters){
            Integer numOfLetter= hMap.get(w);
            if(numOfLetter==null){
                hMap.put(w,1);
            }else{
                hMap.put(w,numOfLetter+1);
            }
        }
        System.out.println(hMap);
    }
}
