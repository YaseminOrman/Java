package practicerepetitions;

import java.util.Scanner;

public class PracticeScanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        double x = input.nextDouble();

        System.out.println(x*x*x);
    }
}
