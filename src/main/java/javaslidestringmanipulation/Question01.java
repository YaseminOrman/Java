package javaslidestringmanipulation;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
        If it is greater than 10 multiply it by 2 and print it on the console.
         otherwise keep the number same and print it on the console.

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = input.nextInt();
        if(a<10 ){
            System.out.println(a*a);
        }else if(a>10)
            System.out.println(2*a);
        else{
            System.out.println(a);
        }


    }
}
