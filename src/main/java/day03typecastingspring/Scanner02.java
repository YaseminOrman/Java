package day03typecastingspring;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullname = scan.nextLine();//to get String data from user use nextline
        System.out.println("The user`s name is  " +fullname );


    }
}
