package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03Review {
    public static void main(String[] args) {

        //Example 1: Let user enter student names into the application
        // (Create an Array together with the user)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int len = input.nextInt();

        String sArray[] = new String[len];


        for (int i = 0; i < len; i++) {

            System.out.println("Enter the " + (i + 1) + ". Student name");
            sArray[i] = input.next();

        }
        System.out.println(Arrays.toString(sArray));

        //Example 1: Let user enter student names into the application
        // (Create an Array together with the user)

        System.out.println("Enter the number of student ");
        int number = input.nextInt();
        String nameInArray[]=new String[number];
       for(int i=0 ; i<number ; i++){
           System.out.println("Enter the" + (i+1) +  ". student name ");
           nameInArray[i]=input.next();
       }
        System.out.println(Arrays.toString(nameInArray));
    }
}