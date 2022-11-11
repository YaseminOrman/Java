package day15multidimensionalarraylist;

import java.util.Arrays;

public class MultiDimensionalArrays03Review {
    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }
        String arr[][]={ {"learn", "java", "it"}, {"is", "easy"} };

        int sum =0;
        for(String[] w : arr){
            sum =sum +w.length;
        }
        String brr[]=new String[sum];
        System.out.println(Arrays.toString(brr));
        int idx = 0;
        for(String[] w : arr){
           for(String m : w) {
               brr[idx]=m;
               idx++;
           }
        }
        System.out.println(Arrays.toString(brr));




    }
}
