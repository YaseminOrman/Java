package day04nestedifswitch;

import java.util.Scanner;

public class Switch01Review {
    //switch statement does the same with if else-if it has just different syntax

    //Get the number of days from user and print the name of the day
    //For example; 1 ==> Sunday, 2 ==> Monday, etc.

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of day ");
        byte dayNumber =input.nextByte();

        switch(dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid number");

        }

    }

}
