package yselfstudylambdastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters01 {
    public static void main(String[] args) {
//
//        ArrayList<Integer> numbersList= new ArrayList<>();
//        numbersList.add(10);
//        numbersList.add(15);
//        numbersList.add(20);
//        numbersList.add(25);
//        numbersList.add(30);

      List<Integer> numbersList= Arrays.asList(10,15,20,25,30);
      List<Integer>evenNumbersList=new ArrayList<>();

      //without using streams
//        for(int w:numbersList){
//            if(w%2==0){
//                evenNumbersList.add(w);
//            }
//            System.out.println(evenNumbersList);
//        }

       // 2.way  with stream
      // evenNumbersList= numbersList.stream().filter(t->t%2==0).collect(Collectors.toList());
      // numbersList.stream().filter(t->t%2==0).forEach(t-> System.out.println(t));
        numbersList.stream().filter(t->t%2==0).forEach( System.out::println);
    }
}
