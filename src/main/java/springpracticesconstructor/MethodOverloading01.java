package springpracticesconstructor;

public class MethodOverloading01 {
    public static void main(String[] args) {

        System.out.println(add(3,5));
        System.out.println(add(7,4));

        System.out.println(add(1,3,5));

        System.out.println(add(1.2,2.3));

        System.out.println(add(4,3.4));

    }
    //Create an add method which adds 2 integers

    public static int add(int a ,int b){
        return  a+b;
    }
    //Create an add method which adds 3 integers

    public static int add(int x,int y ,int z){
        return x+y+z;
    }
    public static double add(double a ,double b){
        return a+b;
    }
    //Create an add method which adds 1 integer and 1 double
    public static double add(int a,double b){
        return a+b;
    }
    public static double add(double a,int b){
        return a+b;
    }

}
