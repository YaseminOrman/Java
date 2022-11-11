package day03typecastingspring;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner class is used to get data from user in  java
        // How will we get data from user
      //  1.step
        Scanner scan = new Scanner(System.in);

        //2.step:
        System.out.println("Enter your age");
        //3.step:
        int age = scan.nextInt();
        System.out.println("The users age is " + age);



    }
}
