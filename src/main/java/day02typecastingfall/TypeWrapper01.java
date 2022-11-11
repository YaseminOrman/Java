package day02typecastingfall;

public class TypeWrapper01 {
    public static void main(String[] args) {
     //Wrapper classes are non primitive data types
     int i =12;//there is no any method
     Integer k = 13;//there are many methods

        char c = 'A';
        Character d = 'A';
        /*
        Wrapper classes name
        byte :    Byte
        short: Short
        int   :  Integer
        long  :Long
        float  :Float
        double  :Double
        boolean  :Boolean
        char    : Character
         */
        //Autoboxing
        byte b = 23;
        Byte wb = b;

        Short ws = 34;
        short s = ws;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Character.MAX_VALUE);
    }

}
