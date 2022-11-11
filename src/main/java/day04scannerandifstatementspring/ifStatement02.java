package day04scannerandifstatementspring;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {
        //ask user to enter an integer then
        //print Even if the integer even
        //print Odd if the integer is odd

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is even or odd ");
        int num = scan.nextInt();

        //in Java, we have modulus operator. modulus operator is "%".
        // Modulus operator gives you to the reminder in the division operation
       //  != means not equals  !true means not true it is false
        //  !false   not false it is true
        if(num%2==0){
            System.out.println("Even");
        }
        if(num%2!=0){
            System.out.println("Odd");

        }
    }
}
