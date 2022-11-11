package day20Review;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.drink();
        c.eat();

        Dog d = new Dog();
        d.bark();
        d.drink();
        d.eat();

        Bird b=new Bird();
        b.tweet();
        b.drink();
        b.eat();
    }
}
