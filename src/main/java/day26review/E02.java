package day26review;

public class E02 {
    public static void main(String[] args) {

        divide(6,0);
    }
    //Create a method to do division then save the result into database
   public static void divide(int a ,int b){
        try {
            System.out.println(a / b + " was saved into database");
        }catch(ArithmeticException e){
            System.out.println("Do not use zero as a divisor");
        }finally {
            System.out.println("Cut the connection with the database");
        }
   }

}
