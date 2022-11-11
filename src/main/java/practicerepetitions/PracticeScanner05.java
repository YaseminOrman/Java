package practicerepetitions;

import java.util.Scanner;

public class PracticeScanner05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of mile ");

        double m = input.nextDouble();

        System.out.println(m*1.6);

        System.out.println("Enter value of hours");

        long h = input.nextLong();

        System.out.println(h*60*60);

        System.out.println("Enter your firstname and lastname");

        String firstname= input.nextLine();
        String lastname = input.nextLine();

        System.out.println("firstname "  + "lastname");



    }
}
