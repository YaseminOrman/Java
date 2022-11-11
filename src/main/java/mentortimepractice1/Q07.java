package mentortimepractice1;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
       // 4) Find the sum of the elements in the array elements of the given multi dimensional array
       // { {1,2,3}, {4,5}, {6,7} } and return an array.
         //       For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
        int brr[]=new int[arr.length];

        int sum=0;
        for(int i=0; i<arr.length;i++){
            for(int k=0 ; k<arr[i].length;k++){
                sum=sum+arr[i][k];
            }
            brr[i]=sum;
            sum=0;
        }
        System.out.println(Arrays.toString(brr));



     //Review
        // 4) Find the sum of the elements in the array elements of the given multi dimensional array
        // { {1,2,3}, {4,5}, {6,7} } and return an array.
        //       For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

        int a[][]={ {1,2,3}, {4,5}, {6,7} };
        int b[]=new int[a.length];
        int sum1=0;

        for(int i=0;i<a.length;i++){
           for(int k=0;k<a[i].length;k++) {
               sum1=sum1+a[i][k];
           }
           b[i]=sum;
           sum=0;

        }
        System.out.println(Arrays.toString(brr));

    }
}
