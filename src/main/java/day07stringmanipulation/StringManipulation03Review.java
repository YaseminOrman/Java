package day07stringmanipulation;

import java.util.Scanner;

public class StringManipulation03Review {
    public static void main(String[] args) {

        String str ="Ali is 13 years old, I like Ali, Ali does not like me!...";

        //Example 1: How many punctuation marks are used in the string

        int numOfChars=str.length();
        int numOfNonPunctuation=str.replaceAll("\\p{Punct}","").length();
        System.out.println(numOfChars-numOfNonPunctuation);

        //Example 2:Ask user to enter his full name,and fix if the user enters space at the beginning and at the end
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first and last name please");

        String fullName =input.nextLine();
        System.out.println(fullName);

        String fixedName=fullName.trim();
        System.out.println(fixedName);


    }
}
