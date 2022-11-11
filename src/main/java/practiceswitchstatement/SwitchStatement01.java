package practiceswitchstatement;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {
      /*
      Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
       */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the month name");
        String monthName =input.next();
        switch(monthName){
            case "December" :
            case "January"  :
            case "February":
                System.out.println("winter");
                break;
            case "march" :
            case "april"  :
            case "may":
                System.out.println("spring");
                break;
            case "june" :
            case "july"  :
            case "august":
                System.out.println("summer");
                break;
            case "september" :
            case "october"  :
            case "november":
                System.out.println("fall");
                break;
            default:
                System.out.println("invalid month name");


        }

    }
}
