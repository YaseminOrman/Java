package day03typecastingspring;

public class Typecasting {
    public static void main(String[] args) {
        //Typecasting converting small data type to large data type or large to small data type

        // byte <short< int <float< double
        // How to convert small data to large data type:Auto Widening

        byte  b = 47;//47 is in byte data type

        int i = b;// 47 is in int data type
        //How to put large data in to small data type:Explicit Norrowing
        double d =1.2;
        short s =(short) d;
        //Convert short 257 to byte?
        short r = 257;
        byte y = (byte)r;
        System.out.println(y);//1

    }
    }


