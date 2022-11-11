package day22Review;

public class Cat1 extends Mammal1 {

    public String name ="Cat";

    public Cat1(){
        System.out.println(name);

        System.out.println(super.name);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat ...");
    }

    @Override
    public Animal1 create() {
        return super.create();
    }
}
