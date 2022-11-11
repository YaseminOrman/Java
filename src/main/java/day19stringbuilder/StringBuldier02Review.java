package day19stringbuilder;

public class StringBuldier02Review {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Yasemin Orman");
        //change string builder to string
        String change=sb1.toString();
        System.out.println(change);

        StringBuilder reverse =sb1.reverse();
        System.out.println(reverse);

        sb1.deleteCharAt(3);
        System.out.println(sb1);

        sb1.delete(2,5);
        System.out.println(sb1);

        sb1.replace(2,7,"Love");
        System.out.println(sb1);

        sb1.insert(3,"XXX");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Java is love");
        StringBuilder sb3=new StringBuilder("Java is love");

        int result=sb2.compareTo(sb3);
        System.out.println(result);

        sb2.setCharAt(4,'x');
        System.out.println(sb2);

    }
}
