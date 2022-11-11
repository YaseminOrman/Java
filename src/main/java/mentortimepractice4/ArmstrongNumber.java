package mentortimepractice4;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        	//is Armstrong??
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");
        int num = scan.nextInt();
        isArmstrong(num);
    }
    public static void isArmstrong(int num) {
        int sum =0;
        String str = String.valueOf(num);

        String[] arr = str.split("");   // 9 4 7 4

        for(int i=0; i<str.length(); i++) {

         // or  sum += Math.pow(Integer.valueOf(arr[i]), arr.length);
                sum += Math.pow(Integer.parseInt(arr[i]), arr.length);   // Math.power(2,4 )  =2*2*2*2
        }
        System.out.println(num==sum ? "The number is Armstrong" : "The number is not Armstrong");
    }


}
