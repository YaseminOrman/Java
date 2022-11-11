package day07stringmanipulation;

public class StringManipulation02Review {
    public static void main(String[] args) {

        String str="Java is OOP";
       String result1= str.replace('O', '*');
        System.out.println(result1);

        String result2=str.replace("Java","*");
        System.out.println(result2);

        String st= "Ali is 13 years old, I think he seems 15.";

        //Example 1 :Change all digits to * in the giving string

       String result3= st.replaceAll("[0-9]","*");
        System.out.println(result3);

        //  Example 2: Type code to check if a password is valid or not for the following conditions;
        // Password must have at least 8 characters different from space character
        //  Password must have at least 1 symbol

        String pwd = "a1 !2   s def ";
       boolean firstRule= pwd.replaceAll("\\s", "").length()>7;

       boolean secondRule =pwd.replaceAll("[A-Za-z0-9 ]", "").length()>0;

        System.out.println("Is the password valid? " + (firstRule && secondRule));

    }
}
