package practicerepetitions;

import java.util.Scanner;

public class PracticeScanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length ");

        double l = input.nextDouble();

        System.out.println("The perimeter of a square is  " + 4*l);

        System.out.println("The area of a square is " + l*l );


    }
}
