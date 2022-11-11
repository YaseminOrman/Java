package day22Review;

public class Animal1 {

    public String name ="Animal";

    public void eat(){
        System.out.println("Animals eat...");
    }

    public Animal1 create(){
       return new Animal1();
    }
}
