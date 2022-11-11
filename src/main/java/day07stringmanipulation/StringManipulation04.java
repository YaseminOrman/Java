package day07stringmanipulation;

public class StringManipulation04 {
    public static void main(String[] args) {

        String str = "String is a non-primitive data type in Java";

        boolean result1 = str.isEmpty();//isEmpty() method returns true if the String does not have any character, returns false if the String has any character
        //str.length()==0 and isEmpty() have same meaning but to check if a String is empty using isEmpty() is preferable
        System.out.println(result1);//true


        boolean result2 = str.isBlank();//isEmpty("")==>true, isEmpty(" ")==>false
        //isBlank("")==>true, isBlank(" ")==>true
        System.out.println(result2);//true

        //Example 1: Check if a String has just letters and spaces in it

        String s = "Learn Java earn money";

      boolean result3=  s.replaceAll("[a-zA-Z ]" ,"").isEmpty();
        System.out.println(result3);

        //Example 1: Check SSN for the following rules
        //       1)it must have just digits
        //       2)it must have 9 digits

        String ssn = "123A45678";
       boolean firstRule= ssn.replaceAll("[0-9]", "").isEmpty();

       boolean secondRule=ssn.length()==9;

       if(firstRule && secondRule){
           System.out.println("Valid ssn");
       }else{
           System.out.println("Invalid ssn");

       }

    }
}
