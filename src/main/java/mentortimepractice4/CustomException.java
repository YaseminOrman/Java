package mentortimepractice4;

public class CustomException {

    //Write a program for creation of user defined exception

    public static void main(String[] args) {
    try {
        printAge(-5);
      }catch (IllegalAgeException e){
        System.out.println("Age can not be negative");
       }
    }

    public static void printAge(int age) throws IllegalAgeException {

        if(age<0){
             throw new IllegalAgeException("Age can not be negative");
        }
        System.out.println(age);
    }
}
