package day07stringmanipulation;

public class StringManipulation01Review {
    public static void main(String[] args) {
        String str="Java is easy";
        boolean isExist=str.contains("Java");
        System.out.println(isExist);


       boolean result= str.startsWith("J");
        System.out.println(result);

      boolean res=  str.startsWith("s", 6);
        System.out.println(res);

         /*
        Example 1 :Check if the given password
        i)has "A" in any position
        ii)has "xy" at the beginning
        iii)has "W" as 7th character
        iv)has 8 characters in total
         */
        String pwd = "xy1AmSW?";

       boolean firstRule= pwd.contains("A");
       boolean secondRule=pwd.startsWith("xy");
       boolean thirdRule=pwd.startsWith("W",6);
       boolean forthRule=pwd.length()==8;
        System.out.println(firstRule && secondRule && thirdRule && forthRule);

        System.out.println("Is the password valid? " + (firstRule && secondRule && thirdRule && forthRule));

        String s ="Do practice to be better";
        boolean t= s.endsWith("r");
        System.out.println(t);

        String m =s.concat("!");
        System.out.println(m);
        System.out.println("".concat("!").concat(s));

    }
}
