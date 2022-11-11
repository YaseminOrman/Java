package mentortimepractice3;

import java.util.Scanner;

public class Q2WhileLoop {
    public static void main(String[] args) {

        //2)Type a program which gets integer values from the user and
        // stops by displaying "Done" when the sum of these values is grater than 100

        Scanner scan = new Scanner(System.in);

        //2.way
        int sum = 0;
        while (sum <= 100) {
            System.out.println("Enter a number:  ");
            sum = sum + scan.nextInt();
        }
        System.out.println("Done "+ sum);
    }
}