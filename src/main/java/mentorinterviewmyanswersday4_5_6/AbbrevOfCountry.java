package mentorinterviewmyanswersday4_5_6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AbbrevOfCountry {
    public static void main(String[] args) {

        // 3)Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
        // Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"  (day 5)


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country's name ");
        String country = input.nextLine().toLowerCase();
         switch (country){
             case "america" :
                 System.out.println("US");
                 break;
             case "germany":

                 break;






         }

    }
}
