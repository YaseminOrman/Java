package day19stringbuilder;

public class StringBuilder01Review {
    public static void main(String[] args) {

        StringBuilder sb1 =new StringBuilder("Clara");

        StringBuilder sb2 =new StringBuilder();
        sb2.append("Clara");
        System.out.println(sb2);

        sb2.append("Ocean");
        System.out.println(sb2);

        sb2.append("Miami ").append("FL ").append("USA ");
        System.out.println(sb2);

        //How to know capacity of the string builder
        StringBuilder sb3 =new StringBuilder();
        sb3.append("Yasemin Orman");
        sb3.append("Diyarbakir");
        sb3.append("Turkey");
        sb3.append("Malatya");

        int numOfChar=sb3.length();
        System.out.println(numOfChar);
        int numOfCapacity=sb3.capacity();
        System.out.println(numOfCapacity);

       String s="012345678";
        System.out.println(s.substring(1,3));
        System.out.println(s.substring(7,7));
        System.out.println(s.substring(7));


    }
}
