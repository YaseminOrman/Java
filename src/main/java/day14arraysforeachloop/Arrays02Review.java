package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02Review {
    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date ="09 20 2022";

        String dateArray[]=date.split(" ");
        System.out.println(Arrays.toString(dateArray));

        System.out.println("Month:"+dateArray[0]+"   " + "Day:"+dateArray[1]  +"   " + "Year:"+dateArray[2]);

        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=input.nextLine();
        String strArray[]=str.split(" ");
        System.out.println(Arrays.toString(strArray));
        System.out.println(strArray.length);

        //Example 3: Count the number of words starts with "a" in the String
        int counter =0;
        for(String w:strArray){
            if(w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter);

        //Example 4: Type code to find the longest word in the sentence
        String s = "I want to go to university to learn more";
        String sArray[]=s.split(" ");
        Arrays.sort(sArray, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(sArray));
        System.out.println(sArray[sArray.length-1]);








    }
}
















