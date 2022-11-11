package day13arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array02Review {
    public static void main(String[] args) {

        //Example 1: Create a String Array and print the elements in alphabetical order on the console in different lines

        //1.way
       String  names[]={"Tom", "Lily", "Selim", "Ali","Mike"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        //2.way

        String names1[]=new String[5];
        names1[0]="Tom";
        names1[1]="Lily";
        names1[2]="Selim";
        names1[3]="Ali";
        names1[4]="Mike";

        Arrays.sort(names1);
        System.out.println(Arrays.toString(names1));

        //3.way
        for(String w:names1){
            System.out.println(w);
        }
        System.out.println("=========");
        //Example 2: Create a String Array and print the elements whose length is less than 5

        for(String w: names ){
            if(w.length()<5){
                System.out.println(w);
            }
        }
        System.out.println("=========");

        //Example 3: Create a String Array and print the elements before "Selim"
        //without selim
        for(String w: names){

            if(w.equals("Selim")){
                break;
            }
            System.out.println(w);

        }
        System.out.println("==========");

        //with selim
        for(String w: names){
            System.out.println(w);
            if(w.equals("Selim")){
                break;
            }

        }
        System.out.println("=========");
        // //Example 5: Create a String Array and print the elements different from "Lily"
        //1.way
        for(String w: names){
            if(!w.equals("Lily")){
                System.out.println(w);
            }
        }
        System.out.println("=========");
        //2.way
        for(String w: names){
            if(w.equals("Lily")){
                continue;
            }
            System.out.println(w);

        }

    }
}
