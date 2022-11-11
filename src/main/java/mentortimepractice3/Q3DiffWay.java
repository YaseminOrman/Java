package mentortimepractice3;

import java.util.Scanner;

public class Q3DiffWay {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("pls enter a number");

            int  x=input.nextInt();


            luckyNumber(x);


        }
        public static void luckyNumber(int num) {
            String b = Integer.toString(num);
            String arr[] = b.split("");
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length / 2) {
                    sum1 = sum1 + Integer.valueOf(arr[i]);

                } else {
                    sum2 = sum2 + Integer.valueOf(arr[i]);
                }
            }

            if (sum1==sum2){
                System.out.println( "Lucky number");

            }else {
                System.out.println( "Unlucky number");
            }
        }



    }
