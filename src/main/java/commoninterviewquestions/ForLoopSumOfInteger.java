package commoninterviewquestions;

import java.util.Scanner;

public class ForLoopSumOfInteger {
    public static void main(String[] args) {

        //Example : Type the code to find the sum of the digits of the integer

        int num =753;
        int numOfDigits=0;
        for(int i=num ; i>0 ; i=i/10){
            numOfDigits  = numOfDigits+i%10;
        }
        System.out.println(numOfDigits);

        //Example : Type the code to find the sum of the unique digits of the integer
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the integer ,please");
        int p =input.nextInt();
        String pS = String.valueOf(p);
        int sumOfTheUniqueDigits = 0;

        for(int i=0 ; i<pS.length() ; i++){
            String a =pS.substring(i,i+1);
            if(pS.indexOf(a)==pS.lastIndexOf(a)){
                sumOfTheUniqueDigits = sumOfTheUniqueDigits+Integer.valueOf(a);
            }
        }
        System.out.println(sumOfTheUniqueDigits);

    }
}
