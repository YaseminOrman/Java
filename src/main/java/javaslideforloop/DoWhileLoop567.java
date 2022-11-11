package javaslideforloop;

import java.util.Scanner;

public class DoWhileLoop567 {
    public static void main(String[] args) {

            //  5.  Ask user to enter a number.
            //    If the number is divisible by 10 then print "Won!" on the console
       // otherwise ask user to enter another number use do while loop
       Scanner input =new Scanner(System.in);

        int num= 0;
        do{
            System.out.println("Enter a number, please");
             num= input.nextInt();
             if(num%10==0){
                 System.out.println("Won");
             }

        }while(num%10==0);
        System.out.println("Lost");

        //6.Ask user to enter a name.
        //If the name contains the letter ‘a’ then print "Won!" on the console
        //otherwise ask user to enter another name.
        //Use do-while loop
        String str=" ";
      do{
          System.out.println("Enter a name,please");
           str=input.nextLine();
           if(str.contains("a")){
               System.out.println("Won");
           }
      }while(str.contains("a"));








    }
}
