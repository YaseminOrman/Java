package mentortimepractice1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        // 4) Create an array whose length is 4 and print the second element on the console.
        int arr[] = {2, 3, 7, 8};
        System.out.println(arr[1]);

        // 6) Type a code to print all elements
        // in reverse order by putting "*" before each of them on the same line

        int brr[] = {34, 45, 67, 68};

        for (int i = brr.length - 1; i > -1; i--) {
            System.out.print(arr[i] + "*");
        }
        // 7)  HOMEWORK : Type code to print the elements whose indexes are even numbers.

        int[] crr ={1, 4, 5, 7, 8,12,20};


        for(int i=0; i<crr.length; i++) {


            if(i%2==0 ) {
                System.out.print(crr[i] + " ");
            }
        }

        //Ask user to create an integer array and type all odd numbers on the console.
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements will you type?");
        int num = scan.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Type " + (i + 1) + ". element");
            numbers[i] = scan.nextInt();


        }

        for (int w : numbers) {

            if (w % 2 == 1) {
                System.out.print(w + " ");


            }
        }


    }
}