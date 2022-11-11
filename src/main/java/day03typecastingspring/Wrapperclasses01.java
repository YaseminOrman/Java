package day03typecastingspring;

public class Wrapperclasses01 {
    public static void main(String[] args) {
   /*


   1)Java created a new structure by putting some methods into primitive data types that structure is called wrapper class
   2)initial changes to uppercase
    Wrapper Classes
   int > Integer
   char> Character
   byte> Byte
   short> Short
   long> Long
   boolean> Boolean
   float> Float
   double> Double
   3) wrapper classes are non-primitive  and they store in the Heap memory

    */
   // how to convert primitive data to wrapper classes:Autobaxing
     char c = 'd';
     Character ws =c;

     int i = 12;
     Integer wi = i;

     float f =1.2F;
     Float wf = f;

     //How to convert wrapper classes to primitive data types:Unboxing
        Short s= 23;
        short ps = s;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Find the min and max value of byte data type
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE + Long.MIN_VALUE);



    }
}
