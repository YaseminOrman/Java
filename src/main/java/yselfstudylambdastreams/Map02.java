package yselfstudylambdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map02 {
    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(2,3,4,5);

//       List<Integer>multipliedList= numbersList.stream().map(t->t*3).collect(Collectors.toList());
//        System.out.println(multipliedList);

        numbersList.stream().map(t->t*3).forEach(System.out::println);
    }
}
