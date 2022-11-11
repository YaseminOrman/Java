package mentorinterviewmyanswersday4_5_6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Type java code by using nested ternary.
//                Write a program to check if a year is leap year or not.
//                If the year is divisible by 100 then it must be divisible by 400.
//        If a year is not divisible by 100 then it must be divisible by 4.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();

      String isLeap = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap":"Not Leap");
        System.out.println(isLeap);


//        Type code to check the password
//        If it has more than 8 characters, initial should be 'i'
//        If it has no more than 8 characters initial should be 'K'
//        Solve the task by using nested-ternary

        System.out.println("Enter the password");
        String password =input.next();
        String isValid = password.length()>8 ? (password.charAt(0)=='i' ? "Valid" : "Not valid"):(password.charAt(0)=='K'? "Valid" : "Not valid");
        System.out.println(isValid);


    }
}
