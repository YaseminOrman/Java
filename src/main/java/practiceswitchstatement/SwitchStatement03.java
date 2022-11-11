package practiceswitchstatement;

import java.util.Scanner;

public class SwitchStatement03 {
    public static void main(String[] args) {
       // Print "Boy" if the gender is "Male" (Ignore cases)
       // Print "Girl" if the gender is "Female" (Ignore cases)
        //Print "Others" if the gender is different from "Male" and "Female"
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the gender");
        String gender =input.next();

        switch(gender){
            case "female":
                System.out.println("Girl");
                break;
            case "male":
                System.out.println("Boy");
                break;
            default:
                System.out.println("Others");

        }

    }
}
