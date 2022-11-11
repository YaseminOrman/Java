package day09loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: Type code to print characters except "m" in a string
        //for example Andromeda ==> Androeda

        String str = "Mama";

        //1.way :
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != 'm') {
                System.out.print(ch);
            }
        }
        System.out.println();
        //2.way :
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'm') {
                continue;//if you want to skip  any value in loop,use "continue"
            }
            System.out.print(ch);
        }
        System.out.println();

        //Example 1: Type code to print characters before "m" in a string
        //  Luxembourg ==>Luxe

        String city = "Luxembourg";
        for (int i = 0; i < city.length(); i++) {
            char ch = city.charAt(i);
            if (ch == 'm') {
                break;//if you want to break any loop under some conditions you can use break keyword
            }
            System.out.print(ch);
        }
        System.out.println();
        //Example 3 : Type code to find the sum of the unique digits in an integer
        //  for example :1232  ==> 1+3=4

        Scanner input =new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");
        String num = input.next();

        int sum =0;
        for(int i=0 ; i<num.length(); i++){
            String digit =num.substring(i,i+1);

            if(num.indexOf(digit) == num.lastIndexOf(digit) ){
                sum =sum+Integer.valueOf(digit);

            }
        }
        System.out.println(sum);




    }
}