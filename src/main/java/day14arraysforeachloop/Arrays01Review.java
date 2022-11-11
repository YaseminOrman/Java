package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01Review {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

       int arr1[]={0, 2, 3, 0, 12,0 };
       int arr2[]=new int[6];
       int idx=0;
       for(int i =0 ;i<arr1.length;i++){
           if(arr1[i]!=0){
               arr2[idx]=arr1[i];
               idx++;
           }
       }
        System.out.println(Arrays.toString(arr2));


        // Example 2: Type code to check if a specific element exists in an array or not
        //            int crr[] = {-12, 23, 5}; check if 23 exists in the array or not
        int crr[]={-12, 23, 5, 23, 23, 23};
        int counter =0;
        int num=-12;

        for(int w : crr){
            if(w==num){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("There are  " + counter +"  times  " +num );
        }else{
            System.out.println("Not exist");
        }
    }
}