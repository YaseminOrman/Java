package mentorinterviewmyanswersday4_5_6;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

//        //5)Type a program to print the minimum of 2 doubles on the console. Use ternary. (day 5)
//
//
//        System.out.println("Enter the  first number");
//        double fNum = input.nextDouble();
//        System.out.println("Enter the  second number");
//        double sNum = input.nextDouble();
//
//        System.out.println( fNum>sNum  ? sNum : fNum);
//
//
//
//
//
//
//
//        //Example : Check SSN for the following rules
//        //       1)it must have just digits
//        //       2)it must have 9 digits
//
//        String ssn = "123456743" ;
//
//
//      String ssn1=  ssn.replaceAll("\\d","");
//
//     if( ssn1.length()==0  && ssn.length()==9){
//         System.out.println("your ssn contain just digit and its length is nine");
//     }else {
//         System.out.println("Invalid ssn");
//
//     }

        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the country name ");
        String countryName = input.next().toLowerCase();
        switch (countryName) {
            case "turkey":
                System.out.println("TR");
                break;
            case "azerbaijan":
                System.out.println("AZ");
                break;
            case "italy":
                System.out.println("IT");
                break;
            default:
                System.out.println("No info about country");
        }

    }
}
