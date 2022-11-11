package mentortimepractice3;

import java.util.*;

public class Q1DuplicateValues {
    public static void main(String[] args) {

        //1) Type code  to find the duplicate values of an array of integer values.

        //1.way
//       // int[]arr  = {10, 20, 50, 50, 60, 60, 70, 20};
//        for(int i=0 ; i<arr.length;i++){
//            for(int j=i+1 ;j<arr.length;j++ ){
//               if(arr[i]==arr[j] ){
//                 System.out.println("Duplicate element :" + arr[j]);
//
//              }
//            }
//        }
//        System.out.println();
//
//       //2.way
//        Set<Integer> hSet = new HashSet<>();
//        for(Integer w : arr){
//            if(hSet.add(w)==false){
//                System.out.println("Duplicate element :"+  w);
//            }
//        }
//
//        System.out.println();
//
//        //3.way
        //1) Type code  to find the duplicate values of an array of integer values.
        int[]arr  = {10, 20, 50, 50, 60, 60, 70, 20,20,20};
        Map<Integer,Integer> hMap = new HashMap<>();

        for(Integer w : arr){
          Integer numOfIntegers= hMap.get(w);
           if(numOfIntegers==null){
               hMap.put(w,1);
           }else{
               hMap.put(w,numOfIntegers+1);
           }
        }

           System.out.println(hMap);
        Set<Map.Entry<Integer, Integer>> entries =hMap.entrySet();
        System.out.println(entries);
        for(Map.Entry<Integer,Integer> w: entries){
            if(w.getValue()>1){
                System.out.println(w.getKey());
            }
        }


    }
}

