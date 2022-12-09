package mentorinterviewmyanswersday10_11_12;

import java.util.Scanner;

public class Q4_5 {
    public static void main(String[] args) {
//        4) Type java code by using while loop,
//                Write a program that prompts the user to input an integer.
//        It should then find the sum of the digits of that number.
//        123 ==> 1+2+3 = 6
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number please");
     int num=scan.nextInt();
     int sumOfDigits = 0;
     while(num>0){
         sumOfDigits=sumOfDigits+(num%10);
         num=num/10;
     }
        System.out.println(sumOfDigits);




//        5) Type java code by using while loop,
//                Write a program that prompts the user to input a number.
//        It should then print the multiplication table of that number.
//        3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30

        System.out.println("Enter the integer to see multiplication table");
        int number = scan.nextInt();
        int factor = 1;
        while(factor<11){
            System.out.println(number + "x" + factor +"="+number*factor);
            factor++;
        }




    }
}
