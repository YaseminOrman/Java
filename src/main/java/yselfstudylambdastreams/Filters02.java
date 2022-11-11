package yselfstudylambdastreams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters02 {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Yasemin","Sadrettin","Selim","Nilufer");
        List<String> longNames=new ArrayList<>();

       // longNames=names.stream().filter(str-> str.length() == 7).collect(Collectors.toList());
       // System.out.println(longNames);
        names.stream().filter(str->str.length()==7).forEach(System.out::println);





    }
}
