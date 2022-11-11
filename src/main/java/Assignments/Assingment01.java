package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Assingment01 {
    public static void main(String[] args) {

        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

         */

        Scanner scan =new Scanner(System.in);
        ArrayList<Integer> elements=new ArrayList<>();

       int i=0;
       while(true){
           System.out.println("Enter your "+(i+1)+".element for the list.Type Q to quit");
           String s=scan.next();
           if(s.equalsIgnoreCase("q")){
             break;
           }
           elements.add(Integer.valueOf(s));
           i++;
       }
        System.out.println("Your elements of list :"+ elements);



    }
}
