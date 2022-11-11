package day07stringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

        String str= "Java is easy";

        boolean isExist=str.contains("Java");

        System.out.println(isExist);

       boolean result= str.startsWith("J");
        System.out.println(result);

      boolean res=  str.startsWith("i",5);//means skip first 5 characters
        System.out.println(res);

        /*
        Example 1 :Check if the given password
        i)has "A" in any position
        ii)has "xy" at the beginning
        iii)has "W" as 7th character
        iv)has 8 characters in total
         */
        String pwd = "xy1AmSW?";

       //i) has "A" in any position
        boolean firstRule = pwd.contains("A");

      //ii) has "xy" at yhe beginning
        boolean secondRule = pwd.startsWith("xy");

       //iii) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("W", 6);

        //iv) has 8 characters in total
        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password vaild? " + (firstRule && secondRule && thirdRule && fourthRule));

        String s ="Do practice to be better";

       boolean  rslt= s.endsWith("r");
        System.out.println(rslt);

        String t=s.concat("!");//concat() method is the same with the "+" in Java

        System.out.println(t);




    }
}
