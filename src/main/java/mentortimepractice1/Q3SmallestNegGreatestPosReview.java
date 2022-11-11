package mentortimepractice1;

import java.util.Arrays;

public class Q3SmallestNegGreatestPosReview {
    public static void main(String[] args) {
        //  Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
        int arr[]={-12, 18, -5, 23, -2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 && arr[i+1]>0){
                System.out.println(arr[i]+" "+arr[i+1]);
            }
        }
        }
    }

