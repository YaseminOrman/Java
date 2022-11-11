package mentortimepractice4;

public class Q7Exception {
    //write a program to describe usage of throw clause
    public static void main(String args[]) {

        try {
            printVoterAge(16);
        }catch(IllegalArgumentException e){
            System.out.println("Invalid age");

        }
    }

    //Create a method to print voter age
    public static void printVoterAge(int age) {
        if(age<18){
            throw new IllegalArgumentException();
        }
         System.out.println(age);

    }
}