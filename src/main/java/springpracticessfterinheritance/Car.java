package springpracticessfterinheritance;

public class Car extends Motorized{

    public Car(String make){
        super(16);
        System.out.println("Car constructor without parameter ");
    }
    public Car(int price ){
        super(20);
        System.out.println("Car constructor with int parameter ");
    }
}
