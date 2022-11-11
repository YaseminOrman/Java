package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03Review {
    public static void main(String[] args) {
        //Example 1: Type code to check if a specific element exists in an Array or not
        String str[] = {"Ali", "Tom", "Carl", "Angie"};

       // 1.way

        String word = "Carl";


        int counter=0;
        for(String w: str){
            if(w.equals(word)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(word +" exist in the array");
        }else{
            System.out.println("It does not exist");
        }

        //2.way
        Arrays.sort(str);
        int idx=Arrays.binarySearch(str,"Selim");
        System.out.println(idx);




    }
}
