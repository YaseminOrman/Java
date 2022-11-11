package day32lambdafunctional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
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

        getMinGreaterThanSevenEvenNum(l);
        getHalfOfDistinctElementsInReversedOrder(l);
    }
    // 9)Create a method to find the minimum value which is greater than 7 and even elements from the list

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list){

        Integer min= list.stream().distinct().filter(t-> t%2==0).filter(t -> t>7).sorted().findFirst().get();

        System.out.println(min);

    }

    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list
    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer>list){

        List<Double>list2=  list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list2);
    }




}
