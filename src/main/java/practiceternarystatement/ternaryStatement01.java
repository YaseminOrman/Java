package practiceternarystatement;

import java.util.Scanner;

public class ternaryStatement01 {
    public static void main(String[] args) {
        /*
        Use ternary to print "Valid Password" if the password has at least 8 characters different
    from space characters. "Invalid Password" if the password has less than 8 characters
    different from space character
         */


        // Use ternary to print
       // a) "Isosceles Triangle" if two sides of a triangle are equal in length.
      // b) "Equilateral Triangle" if all sides of a triangle are equal in length.
      //  c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int a=3,b=2,d=3;
        String typeOfTriangle= a==b && b==d ? "Equilateral Triangle" : a==b && b!=d || a==d && b!=d ||
                b==d && a!=d ? "Isosceles Triangle" : "Neither isosceles, nor equilateral";
        System.out.println(typeOfTriangle);

    /*
    Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
    the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
     */
        //1.way
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = input.nextInt();

    String res = num%2==0 ? "This integer is even" : "This integer is odd";
        System.out.println(res);

        //2.way

        if(num%2==0){
            System.out.println("This integer is even");
        }else{
            System.out.println("This integer is odd");
        }
        /*
        Type java code by using ternary and if-else.
        Ask user to enter two integers
        Write a program to print the minimum one on the console.

         */





    }
}
