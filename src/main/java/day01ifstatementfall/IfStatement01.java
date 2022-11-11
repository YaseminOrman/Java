package day01ifstatementfall;

public class IfStatement01 {
    public static void main(String[] args) {

        //we sometimes need to execute some codes some specific condition
       //example Type code to print negative for the numbers less than zero
       //otherwise it is grater than or equal to zero

        double d = 2.3;
        if (d<0){
            System.out.println("Negative");
        }
        if(d>=0){
            System.out.println("Non-negative");
        }
        //Example2
        //1.way
        int i =15;

        if(i%5==0) {
            System.out.println("divisible by 5");
        }
        if(i%5 != 0){
            System.out.println("not divisible by 5");
        }
     //2.way
     int k =16;
        if(k%5==0) {
            System.out.println("divisible by 5");
        }else{
            System.out.println("Not divisible by 5");

        }
    }
}
