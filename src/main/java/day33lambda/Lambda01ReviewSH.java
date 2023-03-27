package day33lambda;

import day32lambdafunctional.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01ReviewSH {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Tom");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");

        printInUpperCases(l);
        System.out.println();
        //  printInUpperCase02(l);
        printElementSortedByLength(l);
        System.out.println();
        printElementsInReversedOrderSortedByLength(l);
        System.out.println();
        printDistinctElementSortedByLastChar(l);
        System.out.println();
        printEleSortedByLengthThenSortedByInitials(l);
        System.out.println();
        //removeIfTheLengthGreaterThan5(l);
        //removeElIfStartWithAOrEndsWithO01(l);
        //removeElIfStartWithAOrEndsWithO02(l);
       // removeIfLengthIsBetweenFiveAndTenOrEndingWithZero(l);
        System.out.println(checkLengthOfElemLessThan12(l));
        System.out.println(checkAnyNotToStartWithX(l));
        System.out.println(checkAnyElementEndingWithR(l));
    }

    //1)Create a method to print all list elements in Uppercase and
    public static void printInUpperCases(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithASpace);
    }
//    public static void printInUpperCase02(List<String>list){
//
//        list.replaceAll(String::toUpperCase);
//        System.out.println(list);
//    }

    //2)Create a method to print the elements after ordering according to their length

    public static void printElementSortedByLength(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //3)Create a method to print the elements after ordering according to their lengths(In reversed order)

    public static void printElementsInReversedOrderSortedByLength(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    //4)Create a method to sort the distinct elements by using their last character

    public static void printDistinctElementSortedByLastChar(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //5) Create a method to sort the elements according to their lengths then according to their first character.

    public static void printEleSortedByLengthThenSortedByInitials(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

//    //6)Remove the elements if the length of the element is grater 5
//    public static void removeIfTheLengthGreaterThan5(List<String> list) {
//        list.removeIf(t -> t.length() > 5);
//        System.out.println(list);
//    }

//    //7)Remove the elements if the element is starting with 'A' , 'a', or ending with 'O','o'
//    public static void removeElIfStartWithAOrEndsWithO01(List<String> list){
//        Predicate<String> checkCondition= t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='O' || t.charAt(t.length()-1)=='o';
//        list.removeIf(checkCondition);
//        System.out.println(list);
//
//    }
//    public static void removeElIfStartWithAOrEndsWithO02(List<String> list){
//
//        list.removeIf(t->t.startsWith("A")|| t.startsWith("a")||t.endsWith("O")||t.endsWith("o"));
//        System.out.println(list);
//    }
    //8)Remove the elements if the element length is between 5 and 10 or ending with 'o'

//    public static void removeIfLengthIsBetweenFiveAndTenOrEndingWithZero(List<String> list){
//        Predicate<String> checkCondition=t->t.length()>4 && t.length()<11 || t.endsWith("o");
//        list.removeIf(checkCondition);
//        System.out.println(list);
//    }

    //9)Create a method to check if the lengths of all elements are less than 12

   public static boolean checkLengthOfElemLessThan12(List<String> list){

       return  list.stream().allMatch(t->t.length()<12);
   }
   //10)Create a method to check if the initial of any element is not 'X'

    public static boolean checkAnyNotToStartWithX(List<String> list){

        return  list.stream().noneMatch(t->t.startsWith("X"));
    }
    //11)Create a method to check if at least one of the element ending with "r"
    public static boolean checkAnyElementEndingWithR(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }


    }
