package day22Review;

public class Runner1 {

    public static void main(String[] args) {

        Cat1 c = new Cat1();
        System.out.println(c.name);

        Mammal1 d=new Mammal1();
        System.out.println(d.name);

        Animal1 e =new Animal1();
        System.out.println(e.name);

        System.out.println("===========");

        Cat1 f =new Cat1();

        f.eat();

    }
}
