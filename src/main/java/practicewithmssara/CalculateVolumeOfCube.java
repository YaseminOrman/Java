package practicewithmssara;

public class CalculateVolumeOfCube {
    //Create a method to calculate volume of cube ,square prism and rectangular prism

    public double VolumeOfCube(double a){//a*a*a gives you the required outcome.only one edge length is enough
      return a*a*a;
    }

    public  double volumeOfSquarePrism(double a ,double b){
        return a*a*b;
    }

    public static double volumeOfRectangularPrism(double a,double b,double c){
        return a*b*c;
    }

}
