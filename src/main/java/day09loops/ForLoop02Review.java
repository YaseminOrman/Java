package day09loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop02Review {
    public static void main(String[] args) {
        //Example 1: Type code to print characters except "m" in a string
        //for example Andromeda ==> Androeda

        String str="Mama";

        for(int i=0 ; i <str.length() ; i++ ){
            char c =str.charAt(i);
            if(c!='m'){
                System.out.print(c);
            }

        }
        System.out.println();

       // 2.way

        for(int i = 0 ; i<str.length() ; i++){
            char c =str.charAt(i);
                    if(c=='m'){
                        continue;
                    }
            System.out.print(c);

        }
        System.out.println();

        //Example 1: Type code to print characters before "m" in a string
        //  Luxembourg ==>Luxe

        String city ="Luxembourg";
        for(int i =0 ; i <city.length() ;i++){
            char ch = city.charAt(i);
            if(ch=='m'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
        //Example 3 : Type code to find the sum of the unique digits in an integer
        //  for example :1232  ==> 1+3=4

        Scanner input =new Scanner(System.in) ;
        System.out.println("Enter an integer");
        String num =input.next();

        int sum = 0 ;
        for(int i =0 ; i<num.length();i++){
         String digits  = num.substring(i,i+1);
         if(num.indexOf(digits)==num.lastIndexOf(digits)){
             sum=sum+Integer.valueOf(digits);
         }
        }
        System.out.println(sum);

    }
}
