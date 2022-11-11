package practicerepetitions;

import java.util.Scanner;

public class PracticeScanner03 {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        System.out.println("Enter width and length");

        double w = input.nextDouble();

        double l = input.nextDouble();

        System.out.println("Area of the rectangle is  " + w*l);

        System.out.println("Perimeter of the rectangle is  " + 2*(w+l));


    }
}
