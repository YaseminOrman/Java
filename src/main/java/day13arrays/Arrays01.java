package day13arrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    When we create byte,short,int,long,float, double,char,boolean containers we can store just a single value in them
    sometimes we need to store multiple values in a single container to be able to store multiple values java created
    a new structure its name  Array

    Note : Arrays are  to store multiple data in single data type
    you can not store different data types in an array
     */
    public static void main(String[] args) {

        //how to create an Array

        String names[]= new String[5];
        System.out.println(Arrays.toString(names));

        names[1]="Tom";
        names[4]="Mark";
        names[0]="Jim";
        names[2]="Marry";
        names[3]="Susan";

        System.out.println(Arrays.toString(names));

        //How to print a specific element in an Array

        System.out.println(names[3]);

        //Example 1 : Create an integer array and print the sum of the first and
        // the last elements on the console

        int ages[] = new int[7];
        System.out.println(Arrays.toString(ages));


        ages[0] = 12 ;
        ages[1] = 23 ;
        ages[2] = 25 ;
        ages[3] = 14 ;
        ages[4] = 17 ;
        ages[5] = 12 ;
        ages[6] = 14 ;
        System.out.println(ages[0] + ages[ages.length-1]);

        //Example 2: Create a double array and find the sum of all elements in the array
          //           [1.2, 2.3, 5.0, 4.51] ==> 13.01

        double prices [] = new double[4];

        prices[0]=1.2;
        prices[1]=2.3;
        prices[2]=5.0;
        prices[3]=4.51;

        System.out.println(Arrays.toString(prices));
      //1.way
        double sum = 0;

        for(int i=0; i<prices.length;i++){
            sum = sum + prices[i];

        }
        System.out.println(sum);

        //2.way:we will solve the task by using for-each=loop
        //for-each=loop can be used with Arrays and Collections

        double sum2 = 0;

        for(double w : prices){
            sum2 = sum2 + w ;

        }
        System.out.println(sum2);







    }
}
