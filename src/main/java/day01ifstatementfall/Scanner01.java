package day01ifstatementfall;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //example 1:get first middle last name and the SSN from the user
        //  Tom Jim Hanks
        //  234567891

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your middle name");
        String middleName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your SSN");
        String ssn = input.next();

        System.out.println(firstName +" " +  middleName+ " "  +  lastName);
        System.out.println(ssn);



    }
}
