package day11contructorsmethodcallstatickeyword;

import java.sql.SQLOutput;

public class Runner2 {
    public static void main(String[] args) {

        CarMax audi =new CarMax();
        System.out.println( audi.make);
        System.out.println(audi.model);

        CarMax bmw =new CarMax("BMW","M5",2020,50000);
        System.out.println(bmw.make);
        System.out.println(bmw.model);
        System.out.println(bmw.price);


        CarMax mercedes = new CarMax("mercedes","BM4");
        System.out.println(mercedes.make);
        System.out.println(mercedes.model);

        Static02 obj1 =new Static02();
        Static02 obj2 =new Static02();
        Static02 obj3 =new Static02();

        System.out.println(obj1.nonStaticCounter);
        System.out.println(obj1.staticCounter);


    }
}
