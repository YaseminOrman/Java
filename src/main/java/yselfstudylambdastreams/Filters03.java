package yselfstudylambdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters03 {
    public static void main(String[] args) {

        List<String > words= Arrays.asList("cup",null,"forest","sky","book",null,"theatre");

       List<String>result= words.stream().filter(t->t!=null).collect(Collectors.toList());
        System.out.println(result);

        words.stream().filter(t->t!=null).forEach(System.out::println);




    }
}
