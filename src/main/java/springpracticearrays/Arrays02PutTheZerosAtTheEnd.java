package springpracticearrays;

import java.util.Arrays;

public class Arrays02PutTheZerosAtTheEnd {
    public static void main(String[] args) {

       //[0, 2, 3, 0, 12, 0] put the zeros to the end
       int len = 6;
       int arr1[]= new int[len];
        arr1[0]=0;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=0;
        arr1[4]=12;
        arr1[5]=0;
        System.out.println(Arrays.toString(arr1));
        int arr2[]=new int[len];
        System.out.println(Arrays.toString(arr2));
         int k=0;
        for(int i=0 ; i<arr1.length; i++){
            if(arr1[i]!=0){
               arr2[k]= arr1[i];
               k++;
            }
        }
        System.out.println(Arrays.toString(arr2));

        //[0, 0, 0, 0, 12] put the zeros to the end
        int lengthOfArray=5;
        int a[]={0, 0, 0, 0, 12};
        System.out.println(Arrays.toString(a));
        int b[]=new int[lengthOfArray];
        System.out.println(Arrays.toString(b));
        int j=0;
        for(int i=0 ; i < lengthOfArray; i++){
            if(a[i]!=0){
               b[j] =a[i];
               j++;
            }
            System.out.println(Arrays.toString(b));
        }



    }
}

