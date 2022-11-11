package mentorinterviewmyanswersday4_5_6;

import java.util.Scanner;

public class CheckInitialOfPassword {
    public static void main(String[] args) {
//        Ask user to enter a password
//        If the initial of the password is uppercase
//        check if it is 'A' or not.
//        If it is 'A' the output will be "Valid Password"
//        otherwise the output will be "Invalid Password"
//        For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
//
//        If the initial of the password is lowercase
//        check if it is 'z' or not.
//        If it is 'z' the output will be "Valid Password"
//        otherwise the output will be "Invalid Password"
//        For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password");
        char pwdInitial = input.next().charAt(0);
        if(pwdInitial>='A' && pwdInitial<='Z'){
            if(pwdInitial=='A'){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }else if(pwdInitial>='a' && pwdInitial<='z'){
            if(pwdInitial=='z'){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }




    }
}
