package day34lambda;

import day32lambdafunctional.UtilsClass;

import java.util.stream.IntStream;

public class LambdaInStream {
    public static void main(String[] args) {

        System.out.println(getSumFromSevenToHundred());
        System.out.println(getSumFromSevenToHundred2());
        System.out.println(getMultiplicationFromTwoToEleven());
        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorial2(-5));
        System.out.println(sumOfIntegersInGivenRange(-11,-100));
        System.out.println(findSumOfDigitsInGivenRange(23,32));
    }

    //1)Create a method to find the sum of integers from 7 to 100
     //1.way
    public static int getSumFromSevenToHundred(){

       return  IntStream.range(7,101).reduce(0,Math::addExact);
    }
    //2.way
    public static int getSumFromSevenToHundred2(){
       return  IntStream.rangeClosed(7,100).reduce(0,Math::addExact);
    }
    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)

    public static int getMultiplicationFromTwoToEleven(){

       return  IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }
    //3)Create a method to calculate the factorial of given number(5 factorial = 1*2*3*4*5=5!)

    public static int calculateFactorial(int x){
        if(x>0){
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }
        System.out.println("Do not use negative numbers in factorial operation");
        return 0;
    }
    public static Object calculateFactorial2(int x){

        return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use zero or negative numbers in factorial operation";
    }
    //4)Create a method to calculate the sum of even integers between  given two integers

    public static int sumOfIntegersInGivenRange(int a,int b){

        int x=0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }

       return  IntStream.rangeClosed(a,b).filter(UtilsClass::checkToBeEven).sum();
    }
    //5)Create a method to calculate the sum of digits of every integer between given two integers
    // 23 and 32 ==> 2+3  2+4  2+5  2+6  2+7  2+8  2+9 3+0  3+1 3+2 ==> for each sum part we will use sum of digits

    public static int findSumOfDigitsInGivenRange(int a,int b){
        int x=0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
      return IntStream.rangeClosed(a,b).map(UtilsClass::getSumOfDigits).sum();
    }
}
