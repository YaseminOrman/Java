package mentortimepractice3;

import java.util.Scanner;

public class Q4CreatingMethod {

    public static void main(String[] args) {

       // 4)Create a method to count all words in a string get the string from us

         Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = input.nextLine();

        System.out.println(numOfWords(str));

    }

    public static int numOfWords(String str) {
       String[] stringArray= str.split(" ");

       return stringArray.length;
        }
    }


