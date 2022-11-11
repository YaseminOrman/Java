package day02typecastingfall;

public class TypeCasting {
    public static void main(String[] args) {
        //example 1 :Create 2 integer variables and 1 string variable
        int i=13, k=21;

        String s = "Tom";
        System.out.println(i + k + s);

        System.out.println(s + i*k);

        //The casting
        int m =14;
        System.out.println(m);
        double d = m;//this called Auto widening
        System.out.println(d);
        //java does not put large data type into small dt :Explicit narrowing
       int n = 15;
       byte b = (byte)n ;
    }
}
