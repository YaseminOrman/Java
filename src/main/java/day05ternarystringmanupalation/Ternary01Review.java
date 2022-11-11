package day05ternarystringmanupalation;

public class Ternary01Review {
    public static void main(String[] args) {




      //if an integer is positive   print "the integer is positive" otherwise print "the integer is not positive"
        int i =12;
     // 1.way
        if(i>0){
            System.out.println("the integer is positive");
        }else{
            System.out.println("the integer is not positive");

        }
        //2.way
      String result= i>0 ?  "the integer is positive" : "the integer is not positive";
        System.out.println(result);

        //Type a program to print the minimum of two integers on the console.use ternary

        double d=4,e=2;
       double min = d>e ? e : d;
        System.out.println(min);

        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        double f = 0;

       double abs= f>=0 ? f : f*-1;
        System.out.println(abs);

        double betterAbs= f>0 ? f*-1 : f;
          System.out.println(betterAbs);

           /*
        You have 2 integers;
        If both of the integers are positive do multiplication
         Otherwise return "I do not how to multiply"
         */
        int a=12,b=10;

      Object res=  a>0 && b>0 ? a*b : "I do not how to multiply";
        System.out.println(res);



    }
}
