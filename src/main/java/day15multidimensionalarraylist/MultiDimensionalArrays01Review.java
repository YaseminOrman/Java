package day15multidimensionalarraylist;

import java.util.Arrays;

public class MultiDimensionalArrays01Review {
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        //How to print a multidimensional arrays
        System.out.println(Arrays.deepToString(arr));

        //How to assign values to a multidimensional arrays

        arr[0][0]=10;
        arr[0][1]=3;
        arr[1][0]=8;
        arr[1][1]=3;
        arr[2][0]=6;
        arr[2][1]=3;

        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[2][1]);
        System.out.println(arr[1][0]);
        System.out.println(Arrays.toString(arr[2]));

        //Example 1:Type code to find the number of elements in a multidimensional array

        String brr[][]={{"Ali"},{"Lily","Selim","Mark"},{"Tom", "Angie"}};
        int sum=0;
        for(String[] w : brr){
            sum = sum + w.length;
            }
        System.out.println(sum);
        }

    }

