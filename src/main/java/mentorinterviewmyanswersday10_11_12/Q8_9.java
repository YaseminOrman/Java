package mentorinterviewmyanswersday10_11_12;

import java.util.Scanner;

public class Q8_9 {
    public static void main(String[] args) {
//        8) Example: Type code to get the output like
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        Scanner  scan =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row= scan.nextInt();
     for(int i=1;i<=row;i++){
         for(int k=1;k<=i;k++){
             System.out.print(k+" ");
         }
        System.out.println();
     }

        System.out.println();

//        9)Type code to print digits just in the decimal part of the given decimal number with an asterix.
//        For example; 75.4238 ⇒ *4*2*3*8

         double num = 75.4238;
         String str =String.valueOf(num);
         String decPart = str.split("\\.")[1];
         String s="";
         for(int i=0;i<decPart.length();i++){
             String r =decPart.substring(i,i+1);
             s=s+"*"+r;
         }
        System.out.println(s);










    }
}
