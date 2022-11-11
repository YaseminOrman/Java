package javaslidestringmanipulation;

import java.util.Scanner;

public class Question02SecondWay {
    public static void main(String[] args) {

      //  Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’
        //  .” if the name contains “z” output will be “This name contains ‘z’
        //  .” Otherwise, output will be
       //“This name contains neither ‘a’ nor ‘z’.”

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your kid`s name please");

        String str=input.nextLine();
        if(str.contains("a") && !str.contains("z")){
            System.out.println("This name contains 'a' ");
        }else if(str.contains("z")&& !str.contains("a")){
            System.out.println("This name contains 'z' ");
        }else if(str.contains("a") && str.contains("z")) {
            System.out.println("This name contains both 'a' and 'z' ");
        }else{
            System.out.println("This name contains neither ‘a’ nor ‘z’");
        }

    }
}
