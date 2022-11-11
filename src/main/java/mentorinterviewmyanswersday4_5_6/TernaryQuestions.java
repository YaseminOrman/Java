package mentorinterviewmyanswersday4_5_6;

import java.util.Scanner;

public class TernaryQuestions {
    public static void main(String[] args) {
        //5)Type a program to print the minimum of 2 doubles on the console. Use ternary. (day 5)

        double x = 3.2 ,y =2.5;

       double min = x<y ? x : y;
        System.out.println(min);


        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = input.nextDouble();

        double abs = num>=0  ? num : num*-1;
        System.out.println(abs);



          /*
        You have 2 integers;
        If both of the integers are positive do multiplication
         Otherwise return "I do not how to multiply"
         */

        System.out.println("Enter the 1.integer number");
        int number1 = input.nextInt();
        System.out.println("Enter the 2.integer number");
        int number2 = input.nextInt();

        Object multiply = number1>0 && number2>0 ? number1*number2  : "I do not know how to multiply";
        System.out.println(multiply);




    }
}
