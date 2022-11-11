package day07stringmanipulation;

public class StringManipulation04Review {
    public static void main(String[] args) {


        String str = "String is a non-primitive data type in Java";

        boolean result1=str.isEmpty();
        System.out.println(result1);

        boolean result2=str.isBlank();
        System.out.println(result2);

        //Example 1: Check if a String has just letters and spaces in it

        String s = "Learn Java earn money";

        boolean res=s.replaceAll("[A-Za-z ]","").isEmpty();
        System.out.println(res);

        //Example 1: Check SSN for the following rules
        //       1)it must have just digits
        //       2)it must have 9 digits

        String ssn = "123A45678";
       boolean firstRule= ssn.replaceAll("[0-9]","").isEmpty();

       boolean secondRule =ssn.length()==9;

       if(firstRule && secondRule){
           System.out.println("the ssn is valid");
       }else{
           System.out.println("The ssn is not valid");
       }

    }
}
