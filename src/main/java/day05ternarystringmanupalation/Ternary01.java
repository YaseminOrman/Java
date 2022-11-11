package day05ternarystringmanupalation;

public class Ternary01 {
    public static void main(String[] args) {
        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        int i = 12;

//1.Way:
        if(i>0){
            System.out.println("The integer is positive");
        }else{
            System.out.println("The integer is not positive");
        }

//2.Way:ternary
        //Condition     ?       Will be selected for true condition      :    Will be selected for false condition
        String result = i>0         ?           "The integer is positive"            :        "The integer is not positive";
        System.out.println(result);
//Type a program to print the min of 2 doubles on the console use ternary
        //12,23 ==>12  345,23 ==>23  -12 ,-3==>-12
        double d=1.2, e=2.3;

      double min =  d>e ? e:d;
        System.out.println(min);//1.2

        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        double f = 0;

      double abs =  f>=0 ? f: -1*f;
      //note instead of using >= you can use < this is better
      double  betterAbs =f<0 ? -1*f : f;

        System.out.println(abs);

        System.out.println(betterAbs);

        /*
        You have 2 integers;
        If both of the integers are positive do multiplication
         Otherwise return "I do not how to multiply"
         */

        int a =2,b=5;
      //Object data type can be used for all data types
        Object res =a>0 && b>0 ? a*b : "I do not how to multiply";
        System.out.println(res);










    }
}
