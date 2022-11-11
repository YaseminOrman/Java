package springpracticeforloop;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {

        //example type 3 times Hello1 for 1,3 times Hello2 for 2 ,3 times Hello3 for 3,3 times Hello4 for 4.print on the console
        for(int i=1; i<5 ; i++) {
            for (int k = 1; k < 4; k++) {
                System.out.println("Hello" + i);
            }
        }
            /*
            Example 2)type the code to get the output like
            Week: 1
            Day: 1
            Day :2
            Day  :3
            .......
             Week: 2
            Day: 1
            Day :2
            Day  :3
            ......
             Week: 3
            Day: 1
            Day :2
            Day  :3
            .....
              */
        for(int i=1 ;i<4 ;i++){
            System.out.println("Week"+i);
            for(int k =1 ;k<4 ;k++){
                System.out.println("Day"+k);
            }
        }

       /*
       example  Write a java program to print rectangle   star patterns using for loop
                ****
                ****
                ****
          Note :get the number of rows and columns from user

        */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns");
        int columns = input.nextInt();

        for(int i=1 ; i<rows+1 ; i++){
            for(int k=1 ; k<columns+1 ; k++){
                System.out.print("*");
            }
            System.out.println();

        }
         /*
            Example 4)type the code to get the output like
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
              */



    }
}
