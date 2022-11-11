package day04scannerandifstatementspring;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
   /*
   Get the firstname ,middle name,lastname,ssn from user then print them like the following
   Ali Mert Can
   123456789
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();//nextline()takes all the strings but next() will take just the firstname
        System.out.println("Enter your middle name");
        String middleName = scan.next();

        System.out.println("Enter your last name");
        String lastName= scan.next();

        System.out.println("Enter your SSN");
        String ssn =scan.next();

        System.out.println(firstName+ " " + middleName +" " + lastName );
        System.out.println(ssn);




    }
}
