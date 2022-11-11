package javaslideforloop;

import java.util.Scanner;

public class WhileLoopQuestions {
    public static void main(String[] args) {

        //1.Type java code by using while loop,
        //Write a program to print numbers from 1 to 5.
        int i=1;
        while(i<6){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //2.Type java code by using while loop.
        //Write a program that types first 30 consecutive odd integers.

        int k=1;
        while(k<60){
            if(k%2!=0){
                System.out.print(k +" ");
            }
            k++;
        }
        System.out.println();
        //3) Type java code by using while loop,
        //Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a positive integer ");
        int n =input.nextInt();
        int p =1;
        while(p<11){
            System.out.println(n + "x" + p + "=" + p*n);
            p++;
        }

        System.out.println();
        //4)Type java code by using while loop,
        //Write a program that prompts the user to input a positive integer. It should then print factorial of that number.
        System.out.println("Enter the positive number please");
        int  num =input.nextInt();
        long factorial = 1;

        for(int j=1 ; j<=num ; j++){
            factorial=factorial*j;
        }
        System.out.println(factorial);
        System.out.println();

        int j =1;
        while(j<=num){
            factorial=factorial*j;
            j++;
        }
        System.out.println(factorial);

        System.out.println();

        //5) Type java code by using while loop,
         //       Write a program to count the factors of an integer which is entered by user.
        System.out.println("Enter an integer please");
        int number = input.nextInt();

        int m =1;
        while(m<=number){
            if(number%m==0){
                System.out.print(m +" ");
            }
            m++;
        }
        System.out.println();

        //6) Type java code by using while loop,
        //Write a program that prompts the user to input an integer. It should then find sum of the digits of that number.
        System.out.println("Enter an integer please ");
        int b =input.nextInt();
        int sumOfTheDigits=0;
        while(b>0){
            sumOfTheDigits=sumOfTheDigits+b%10;
           b= b/10;
        }
        System.out.println(sumOfTheDigits);


    }
}
