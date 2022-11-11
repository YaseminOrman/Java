package day24review;

public interface Ac extends BigAc {

     void digital();

     void price();

     int price=2300;

     String name="Perfect Ac";

     //How to type concrete method in an interfaces
     //1.way;
     public default int calculate(){
          return 1200;
     }
     //2.way;
     public static boolean climate(){
          return true;
     }


}
