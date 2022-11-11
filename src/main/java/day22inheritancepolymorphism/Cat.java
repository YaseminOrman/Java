package day22inheritancepolymorphism;

public class Cat extends Mammal {

    public String name ="Cat";

    public Cat(){
        System.out.println(this.name);

        System.out.println(super.name);
    }

    @Override//Overriding method
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public Animal create() {
        return super.create();
    }

    @Override
    public Integer add() {
        return super.add();
    }

    @Override
    public int multiply() {
        return super.multiply();
    }



}
