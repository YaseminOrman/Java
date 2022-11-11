package yesoacademypractice1;

import java.awt.*;

public class Circle {

    Point center;
    double radius;
    static int numberOfCircle;

    Circle(){
        numberOfCircle++;
    }
    Circle(Point center,double radius){
        numberOfCircle++;
      this.center =center;
        this.radius =radius;
    }

    double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    void setRadius(double radius){
       this. radius=radius;
    }
    void setCenter(Point center) {
       this. center = center;
    }
    static int getNumberOfCircle(){
        return numberOfCircle;
    }

}
