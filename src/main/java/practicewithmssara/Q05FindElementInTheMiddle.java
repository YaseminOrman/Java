package practicewithmssara;

import java.util.Arrays;

public class Q05FindElementInTheMiddle {
    public static void main(String[] args) {
        /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
        int arr[]={12, 5, 8, 21, 13, 15, 50};

        Arrays.sort(arr);
        int middleIdx=arr.length/2;
        System.out.println(Arrays.toString(arr));
        System.out.println(middleIdx);

        if(arr.length%2!=0){
            System.out.println(middleIdx);
        }else{
            int middle =(arr[middleIdx] + arr[middleIdx-1])/2;
            System.out.println(middle);
        }


        /*
        2.way
        int arr [] = {12, 8, 5, 10};

         Arrays.sort(arr);
        if (arr.length%2!=0){
       System.out.println((arr[arr.length / 2]));
       }else {
       System.out.println((arr[arr.length/2]+arr[arr.length/2-1])/2);


         */
    }
}
