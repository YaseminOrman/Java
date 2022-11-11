package day04scannerandifstatementspring;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

    //ask user to enter an integer than
    //print Positive on the console if the number is positive
    //print Negative on the console if the number is negative
     //print Notre on the console if the number is zero

     /*
     if you want to run different code for different condition you should use "if statement"

      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check its sign ");
       int num = scan.nextInt();

       if (num>0){
           System.out.println("positive");

       }
       if(num<0){
           System.out.println("negative");
       }
       if(num==0){
           System.out.println("nautral");
       }

    }

}
