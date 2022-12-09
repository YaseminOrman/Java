package mentorinterviewmyanswersday10_11_12;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        1)   Example 1: Ask user to enter an integer.
//        If the integer is less than 100, tell user "Won!"
//        Otherwise, tell user "Lost!"
        Scanner input = new Scanner(System.in);
        int number=0;
        do{
            System.out.println("Enter the number please");
            number = input.nextInt();
                System.out.println("Won");
        }while(number<100);
        System.out.println("Lost");




        }
    }

