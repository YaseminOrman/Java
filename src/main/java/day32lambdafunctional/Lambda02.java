package day32lambdafunctional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Lambda02 {
    /*
    1)Variables==>logic ==> this structure called "Lambda Expression"

    2)In Functional Programing ,we use "Lambda Expression" ,it is allowed but not recommended .
    instead of "Lambda Expression", we prefer "method reference "
    3)Method Reference is" Class Name :: Method Name "
    for exp ; "String :: length " (do not type method parenthesis,type just method name )
             " Arrays :: toString"
    You can your own class to create the required methods for your application .For ex;you created "Animal" class  you have the eat method
        in Animal class ==> "Animal::eat"
     */
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquareOfDistinctEvenElements(l);
        sumOfSquareOfDistinctEvenElements2(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxElement01(l);
        getMinElement01(l);
        getMinGreaterThanSevenEvenNumber(l);
        getHalfOfDistinctElementsInReversedOrder(l);

    }
    //1)Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements. (Structured P)
    public static void printElementsFunctional(List<Integer> list){

        list.stream().forEach(UtilsClass::printInTheSameLineWithASpace);
    }
    //2)Create a method to print the even elements in the list on the console in the same line with a space
    //between two consecutive ele.s (Structured P)
    public static void printEvenElementsStructured(List<Integer> list){

        list.stream().filter(UtilsClass::checkToBeEven).forEach(UtilsClass::printInTheSameLineWithASpace);
    }
    // 3) Create a method to print the square of odd list elements on the console in the same line with a space between
    // two consecutive elements (Functional P)

    public static void printSquareOfOddElements(List<Integer> list){

        list.stream().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getSquare).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //4) Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.
    //By Using Functional method Reference:
    public static void printCubeOfDistinctOddElements(List<Integer> list){

        list.stream().distinct().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getCube).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //Create a method to calculate the sum of the squares of distinct even elements
    //1.way
    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list){

      Integer sum=  list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //2.way
    public static void sumOfSquareOfDistinctEvenElements2(List<Integer> list){

        Integer sum=  list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,Integer::sum);
        System.out.println(sum);
    }
    //6)Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

        Integer product=list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getCube).reduce(1,Math::multiplyExact);

        System.out.println(product);
    }
    //7)Create a method to find the max value from the list element
    public static void getMaxElement01(List<Integer> list){

        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);

    }
    // 8)Create a method to find the min value from  the list elements (in 2.way) HOMEWORK
    public static void getMinElement01(List<Integer> list){

       Integer min= list.stream().distinct().reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);
    }

    public static void getMinGreaterThanSevenEvenNumber(List<Integer> list){

     Integer min= list.stream().distinct().filter(t->t>7).filter(UtilsClass::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);
    }
    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list
    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer>list){

     List<Double> result=  list.stream().
             distinct().filter(t->t>5).
             map(UtilsClass::getHalf).
             sorted(Comparator.reverseOrder()).
             collect(Collectors.toList());
        System.out.println(result);
    }

    }
