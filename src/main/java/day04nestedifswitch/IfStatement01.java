package day04nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        Scanner  input =new Scanner(System.in);
        System.out.println("Enter your age" );
        int age = input.nextInt();
        if(age<0) {
            System.out.println("invalid age");
        }else   if(age<5){
            System.out.println("baby");
        }else if(age<13){
            System.out.println("child");
        }else if(age<21){
            System.out.println("Teenager");
        }else if(age<31){
            System.out.println("Adult");
        }else{
            System.out.println("not expected age");
        }
     //0 4 12 20 30 are the critical numbers
        //-3 3 5 13 25 45 are boundary value analysis should do testing always

    }
}
