package day11contructorsmethodcallstatickeyword;

public class CarMax {

    String make="Toyota";
    String model="Prius";
    int year=2015;
    int price =15000;

    public CarMax(){
        System.out.println("CarMax constructor 1");
    }

    public CarMax(String make,String model,int year,int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public CarMax(String make,String model){
        this.make=make;
        this.model=model;
    }

}
