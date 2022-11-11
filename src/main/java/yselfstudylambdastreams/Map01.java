package yselfstudylambdastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map01 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehicleListInUpperCase = new ArrayList<>();
        //before java 8 without using streams
//        for(String name:vehicles){
//            vehicleListInUpperCase.add(name.toUpperCase());
//        }
//        System.out.println(vehicleListInUpperCase);

        //with stream
        vehicleListInUpperCase= vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(vehicleListInUpperCase);
        //1.way
//        for(String name : vehicles){
//            System.out.println(name.length());
//        }

        //using streams
        vehicles.stream().map(String::length).forEach(System.out::println);

    }
}
