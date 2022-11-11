package day04scannerandifstatementspring;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        Type a program which calculate the value of rectangular prism whose w,h and,h are entered
        by user
        volue = w*h*l
          */
       Scanner scan =new Scanner(System.in) ;
        System.out.println("Enter teh length ");
        double length = scan.nextDouble();

        System.out.println("Enter the width");
        double width = scan.nextDouble();

        System.out.println("Enter the height");
        double height = scan.nextDouble();

        System.out.println("The value is " +length*width*height);

    }
}
