package practicerepetitions;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the String please");
        String str =input.nextLine();

       String firstInitial= str.substring(0,1);
        System.out.println(firstInitial);
        int idxLastInitial=str.indexOf(" ")+1;
       String lastInitial=str.substring(idxLastInitial,idxLastInitial+1);
        System.out.println(lastInitial);

        //example:check if any Character exist in a string or not

        String characterToCheck="x";
       int result= str.indexOf("x");
       if(result==-1) {
           System.out.println("The character does not exist");
       }else{
           System.out.println("the character exist");

       }
       //2.way
      boolean isContain=  str.contains("x");
       if(isContain){
           System.out.println("the character exist");
       }else{
           System.out.println("The character does not exist");

       }
    }
}
