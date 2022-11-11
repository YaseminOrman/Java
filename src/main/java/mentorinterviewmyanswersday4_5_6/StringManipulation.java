package mentorinterviewmyanswersday4_5_6;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // 7) Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios (day06)

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=input.nextLine();
        if(str.indexOf('a')==-1){
            System.out.println("There is no 'a'");
        }else{
            System.out.println("There is 'a'");
        }

        // 8) Type code to check if a character is unique in a String or not (day06)

        String word = "anne";
        if(word.indexOf('n')==-1){
            System.out.println("The character does not exist");
        }else if(word.indexOf('n')!=word.lastIndexOf('n')){
            System.out.println("This character is  unique");
        }else{
            System.out.println("This character is not unique");
        }





    }
}
