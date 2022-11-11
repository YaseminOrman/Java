package mentortimepractice1;

import java.util.Arrays;
import java.util.Scanner;

public class Q02Review {
    public static void main(String[] args) {
        //Ask user to create an integer array and type all odd numbers on the console.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num of elements");
        int numOfElements=scan.nextInt();

        int arr[]=new int[numOfElements];
        for(int i =0 ;i< arr.length;i++){
            System.out.println("Enter the "+ (i+1) +".element");
            arr[i]=scan.nextInt();
        }
        for(int w:arr){
            if(w%2!=0){
              System.out.println(w);}
        }
        //  Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        //  For example; if the array is [1, 2, 3] output will be [2, 3, 1].

        int brr[]={1,2,3};
        int crr[]=new int[brr.length];
        crr[brr.length-1]=brr[0];
        for(int i =1;i<brr.length;i++){
            crr[i-1]=brr[i];
        }
        System.out.println(Arrays.toString(crr));

    }
}
