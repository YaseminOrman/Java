package mentorinterviewmyanswersday4_5_6;

import java.util.Scanner;

public class CreateCalculator {
    public static void main(String[] args) {
        // 4)Create a simple calculator which does addition, subtraction, multiplication, division,
        // percentage calculation using switch (day 4)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNum = input.nextDouble();
        System.out.println("Enter the second number");
        double secondNum = input.nextDouble();
        String operation=input.next();
        switch (operation){
            case "+" :
                System.out.println(firstNum+secondNum);
                break;
            case "-" :
                System.out.println(firstNum-secondNum);
                break;
            case "*" :
                System.out.println(firstNum*secondNum);
                break;
            case "/" :
                System.out.println(firstNum/secondNum);
                break;
            case "%" :
                System.out.println(firstNum%secondNum);
                break;
            default:
                System.out.println("There is no such operation");


        }






    }
}
