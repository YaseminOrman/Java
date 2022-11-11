package mentortimepractice3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {

//        String[] words = {"learn","Java","love","Java","learn","coding"};
//
//        for(int i=0;i<words.length;i++){
//            for(int j=i+1;j<words.length;j++){
//                if(words[i].equals(words[j])){
//                    System.out.println("Duplicate elements:" + words[j]);
//                }
//            }
//        }
//        System.out.println();
//
//        Set<String> hSet =new HashSet<>();
//        for(String w : words){
//            if(hSet.add(w)==false){
//                System.out.println("Duplicate elements:" +w);
//            }
//        }
//        System.out.println();
//
        //7)Type a code to find the duplicate element in String Array
        //    {"learn","Java","love","Java","learn","coding"}

        String[] words = {"learn","Java","love","Java","learn","coding"};
        Map<String,Integer> hMap = new HashMap<>();
        for(String w : words){
           Integer numOfWords= hMap.get(w);
           if(numOfWords==null){
               hMap.put(w,1);
           }else{
               hMap.put(w,numOfWords+1);
           }
        }
        System.out.println(hMap);
        Set<Map.Entry<String, Integer>> entries = hMap.entrySet();
        for(Map.Entry<String, Integer> w : entries){
            if(w.getValue()>1){
                System.out.println(w.getKey());
            }
        }
    }
}
