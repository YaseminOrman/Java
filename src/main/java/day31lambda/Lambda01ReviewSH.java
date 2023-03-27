package day31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01ReviewSH {
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
        printElementsFunctional(l);
        System.out.println();
        printSquareOfOdds(l);
        System.out.println();
        printCubeOfDistinctOdds(l);
        System.out.println();
        sumOfSquareDistinctEvens(l);
        productOfCubeDistinctEvens(l);
        getMaxElement(l);
        getMaxElement2(l);
        getMinEl(l);
        getMinElement2(l);
        getMinGreaterThanSevenEven(l);
        getHalfOfDistinctReversedEl(l);
    }
    //1)Create a method to print the elements on the console in the same line with a space

    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
    }

    //2)Create a method to print the even elements in the list on the console in the same line with a space
    //between two consecutive ele.s (Structured P)
    public static void printEvenFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    // 3) Create a method to print the square of odd list elements on the console in the same line with a space between
    // two consecutive elements (Functional P)
    public static void printSquareOfOdds(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    //4) Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.
    public static void printCubeOfDistinctOdds(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquareDistinctEvens(List<Integer> list){
       Integer sum = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println("sum = " + sum);
    }
    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDistinctEvens(List<Integer> list){
      Integer product =  list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println("product = " + product);
    }
    //7)Create a method to find the max value from the list element
    public static void getMaxElement(List<Integer> list){
       Integer maxEl = list.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.println("maxEl = " + maxEl);
    }
    //2.way for finding max element
    public static void getMaxElement2(List<Integer> list){
       Integer maxEl2 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("maxEl2 = " + maxEl2);
    }

    // 8)Create a method to find the min value from  the list elements (in 2.way)
    public static void getMinEl(List<Integer> list){
      Integer minEl =  list.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println("minEl = " + minEl);
    }
    //2.way for finding min element
    public static void getMinElement2(List<Integer> list){
       Integer minEl2 = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("minEl2 = " + minEl2);
    }
    // 9)Create a method to find the minimum value which is greater than 7 and even elements from the list
    public static void getMinGreaterThanSevenEven(List<Integer> list){
      Integer minEl =  list.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();
        System.out.println("minEl = " + minEl);
    }
    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list
    public static void getHalfOfDistinctReversedEl(List<Integer> list){
      List<Double> resultList =  list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("resultList = " + resultList);
    }

}
