package mentortimepractice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q8 {
    public static void main(String[] args) {


        String[] words = {"learn","Java","love","Java","learn","coding"};
        Map<String,Integer > hMap = new HashMap<>();
        for(String w : words){
            Integer numOfWords = hMap.get(w);
            if(numOfWords==null){
                hMap.put(w,1);
            }else{
                hMap.put(w,numOfWords+1);
            }
        }
        System.out.println(hMap);
        Set<Map.Entry<String, Integer>> entries =hMap.entrySet();
        for(Map.Entry<String, Integer> w: entries){
           if(w.getValue()>1){
               System.out.println(w.getKey());
           }
        }


    }
}
