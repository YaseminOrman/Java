package practicewithmssara;

public class RunnerForCalculationOfVolume {
    public static void main(String[] args) {

        CalculateVolumeOfCube obj1 =new CalculateVolumeOfCube();//in every object we need a constructor

        System.out.println(obj1.VolumeOfCube(12));
        System.out.println(obj1.volumeOfSquarePrism(12,1.85));
        System.out.println(obj1.volumeOfRectangularPrism(15,7.52,4.45));
    }
}
