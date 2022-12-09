package mentorinterviewmyanswersday10_11_12;

import java.util.Scanner;

public class Q6_7 {
    public static void main(String[] args) {
//        6)Example:Type code to get the output like
//        Week: 1
//        Day: 1
//        Day: 2
//        Day: 3
//                       .....
//        Week: 2
//        Day: 1
//        Day: 2
//        Day: 3
//                       ....
//        Week: 3
//        Day: 1
//        Day: 2
//        Day: 3
//....

       for(int i =1 ;i<5;i++) {
           System.out.println("Week: "+i);
           for(int k=1 ;k<8;k++){
               System.out.println("    Day: "+k);
           }
       }





//        7) Write a Java Program to Print Rectangle Star Pattern using For Loop
//                     ****
//                     ****
//                     ****
//        Note: Get the number of the rows and the columns from user

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row =scan.nextInt();
        System.out.println("enter the number of column");
        int column=scan.nextInt();

        for(int i=1;i<=row;i++){
            for(int k=1;k<=column;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
