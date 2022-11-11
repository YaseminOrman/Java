package yesoacademypractice1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.numberOfCircle);

        Circle c1 =new Circle(new Point(1,2),3);
        System.out.println(c1.numberOfCircle);
        Circle c2 =new Circle(new Point(2,3),2);
        System.out.println(c2.numberOfCircle);



    }
}
