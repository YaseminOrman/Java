package day25review;

public class E06 {
    public static void main(String[] args) {

       // doCombo(null,2);
       // doCombo("12a",2);
       // doCombo("420",0);

        //doCombo2(null,2);
        doCombo2("12a",2);

    }
    //Create a method i)Find the length of the String ii)Convert the String to an integer iii)Divide the integer by a given number
    public static void doCombo(String str,int num) {

        try {

            int length = str.length();
            System.out.println(length);

            int intStr = Integer.valueOf(str);
            System.out.println(intStr);

            int result = intStr / num;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("There is a problem in finding length");
        } catch (NumberFormatException e) {
            System.out.println("There is problem in conversion ");
        } catch (ArithmeticException e) {
            System.out.println("There is a problem in division");
        }

        System.out.println("Execution did not stop");
    }

        public static void doCombo2 (String str,int num){

            try {

                int length = str.length();
                System.out.println(length);

                int intStr = Integer.valueOf(str);
                System.out.println(intStr);

                int result = intStr / num;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Execution did not stop");

        }

    }
