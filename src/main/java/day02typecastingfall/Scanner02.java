package day02typecastingfall;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //examole 1 get w and l of a rectangle and calculate area
        Scanner  input = new Scanner(System.in);

        System.out.println("Enter the width");

       Double width = input.nextDouble();

        System.out.println("Enter the length");

       Double length = input.nextDouble();

        System.out.println("Area is " + width*length);

    }
}
