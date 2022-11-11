package mentortimepractice1;

import java.util.Arrays;

public class Q4RotatedLeft {
    public static void main(String[] args) {
        /* 9) Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        For example; if the array is [1, 2, 3] output will be [2, 3, 1].
        */

        int arr[]={1,2,3,4};
        int brr[]=new int[arr.length];

        brr[arr.length-1]=arr[0];

        for(int i=1 ;i<arr.length;i++ ){
            brr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(brr));







    }
}
