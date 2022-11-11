package mentorinterviewques_answers;

public class Day1_2_3 {
    public static void main(String[] args) {
        /*

        1
      How Many types of memory are there in Java.
      Memory Usage in Java
      There are 2 types of memory in Java.
      1) Stack Memory: i)Primitive Data   2) References(or Address) of Non-Primitive Data
      2) Heap Memory: Stores Non-Primitive Data





    2)  What are the differences between "Primitive Data Types and "Non-Primitive Data Types"

1) "Primitive Data Types"have just value but "Non-Primitive Data Types"
have values and method.
2) "Primitive Data Types"were created by Java, we can not create any
primitive data type. But we can create "Non-Primitive Data Types"
whenever we need.
3)   "Primitive   Data   Types"   use   just   lower   cases   in   their   names.
But   "Non-Primitive   Data   Types"   starts   with   upper   cases
4) Usage of memory in "Primitive Data Types" changes from data type , But
all "Non-Primitive Data Types"use same amount memory.




1

2

What is Scanner
The Scanner class is used to get user “input”
1. Step:Create objectClass Name      Object Name        Assignment Operator          New Keyword        Constructor ==>Class
Scanner               input                       =                                           new                   Scanner(System.in);

 2. Step : Give message to user about the data you ask. By using the object
System.out.println("Enter your age ");
 3. Step:  Get the data by the help of the "input" object
int age=input.nextInt();
System.out.println(age);
Question : what are there inside class
Scanner Class Methods
There  are various methods of Scanner class  which  can  be used  for
various data   types.   Take   a   look   at   the   below   table   to   know   about
these methods.
MethodDescription
nextBoolean() Reads a boolean value from the user
nextByte() Reads a byte value from the user
nextDouble() Reads a double value from the user
nextFloat() Reads a float value from the user
nextInt() Reads an int value from the user
nextLine() Reads a String value from the user
nextLong() Reads a long value from the user
nextShort() Reads a short value from the user Class Name      Object Name        Assignment Operator          New Keyword      Constructor ==>Class
Name +()
Scanner               input                       =                                           new                   Scanner(System.in);





1

What is Type-Casting
TYPE CASTING


 AutoWidening
     Java can put small data types into large data types automatically
     when you put small data type into a large data type , you are widening
the small data type.

       int m=14;
        System.out.println( m );
       double d=m;
        System.out.println( d );
    Explicit Narrowing
     Java does not put large data types into small data types.

int n=15;
byte b= (byte)n;






 1

What is Wrapper-Class
Wrapper Class:
Non-Primitives "Methods" together with values.
We can do many actions by using any "methods "
But primitives do not have any "methods" because of that we can not any
actions in primitives.
Java Created a new structure which has "Primitive value" and "methods "
together, that new structure is called "Wrapper Class"
  Wrapper Classes are  Non-Primitive data types.
  Primitive Data          Wrapper Class
        byte           ->         Byte
        short          ->       short
        int            ->          Integer
        long           ->        Long
        float          ->           Float
        double         ->       Double
        boolean        ->       Boolean
        char                     Character
What is Autoboxing: To convert  its "primitive data type” to  ""Wrapper
class
int i=12;  //There is no   method
Integer k=13; //There are many methods
char c='A';
Character d='A';
byte b=23;
Byte wb=b;
What is Unboxing : To convert "Wrapper class to its "primitive data type"
 Short  ws=34;
  short s=ws;
         */
    }
}
