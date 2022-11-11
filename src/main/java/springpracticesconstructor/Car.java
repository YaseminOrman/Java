package springpracticesconstructor;

public class Car {

    String make ;
    String model;
    double price;
    int year;

    public Car(String make ,String model,double price,int year){
       this.make = make;
       this.model = model;
       this.price = price;
       this.year = year;

    }

    public Car(){

    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make="Honda";
        c1.model="Civic;";
        c1.price=10000;
        c1.year=2015;

        Car c2 =new Car();
        c2.make="Audi";
        c2.model="S5";
        c2.price=20000;
        c2.year=2019;

        Car c3 = new Car("BMW","M4",70000,2019);

        Car c4 = new Car("Mercedes", "GLE" ,80000,2021);





    }
}

