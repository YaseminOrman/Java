package day07stringmanipulation;

public class StringManipulation02 {
    public static void main(String[] args) {

        String str = "Java is OOP";

      String result1=  str.replace('O', '*');
        System.out.println(result1);

       String result2= str.replace("Java", "*");
        System.out.println(result2);

        String st= "Ali is 13 years old, I think he seems 15.";
          //1.way is not recommended
        //Example 1 :Change all digits to * in the giving string
        String result3 = st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(result3);
        // if your code does not work for all values it is called Hard coding and it is not accepted

        //2.way
       /*
       Regex means Regular Expressions
       Regex represent a group of data
       All digits : [0-9]
       All lowercase letter:[a-z]
       All uppercase letter:[A-Z]
       All lower and upper case : [A-Za-z]
       All lower and upper case and digit:[A-Za-z0-9]
       Some multiple characters like e,i,o,u,a:[eioua]

        All characters different from digits:[^0-9]
        All characters different from letters:[^a-zA-Z]
        All characters different from vowels:[^aeiuo]

        Space character : \\s
        All characters different from space:\\S

        All digits :\\d
        All characters different from digits:\\D

        All lower and upper case and digit and _:\\w
        Different from All lower and upper case and digit and _:\\W

        All Punctuation marks :\\p{Punct}

        */

      String  result4= st.replaceAll("[0-9]" , "*");
        System.out.println(result4);


      //  Example 2: Type code to check if a password is valid or not for the following conditions;
       // Password must have at least 8 characters different from space character
      //  Password must have at least 1 symbol

        String pwd = "a1 !2   s def ";
        //Password must have at least 8 characters different from space character
        boolean firstRule = pwd.replaceAll("\\s", "").length()>7;
        //Password must have at least 1 symbol
        //boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]","").length()>0;
        //Following can be used to remove space as well but it is difficult to notice space was removed, because of that above is better to use
        boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        System.out.println("Is the password valid? " + (firstRule && secondRule));






    }
}