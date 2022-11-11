package javaslidestringmanipulation;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {


     /*
        Ask user to enter his kid’s name,
        if the name contains “a” output will be “This name contains ‘a’.
        ” if the name contains “z” output will be “This name contains ‘z’.”
         Otherwise, output will be
        “This name contains neither ‘a’ nor ‘z’.”

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your kid's name");
        String name = input.nextLine();

        if (name.indexOf('a') != -1 && name.indexOf('z') == -1) {
            System.out.println("This name contains only 'a' ");
        } else if (name.indexOf('z') != -1 && name.indexOf('a') == -1) {
            System.out.println("This name contains only 'z' ");
        } else if (name.indexOf('z') != -1 && name.indexOf('a') != -1) {
            System.out.println(" This name contains both 'a' and 'z'");
        } else {
            System.out.println("This name contains neither 'a' nor 'z'");


        }

    }
}




