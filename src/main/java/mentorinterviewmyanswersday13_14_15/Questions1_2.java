package mentorinterviewmyanswersday13_14_15;

import java.util.Arrays;
import java.util.Scanner;

public class Questions1_2 {
    public static void main(String[] args) {

//        Q01 -  Let user  enter student names into the application
//                (Create an Array together with the user)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStd = input.nextInt();

        String[] srr = new String[numOfStd];

        for(int i =0 ;i<srr.length;i++){
            System.out.println("Enter the" +(i+1) + ".student's name ,enter 'Q' to stop" );
            String sName = input.next();
            if(!sName.equalsIgnoreCase("Q")){
                srr[i] = sName;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(srr));



      //  Q02- Create an Integer Array and print the elements of the Array in Reverse order












    }
}
