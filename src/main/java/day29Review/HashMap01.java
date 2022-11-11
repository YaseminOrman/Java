package day29Review;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String , Integer > stdAges = new HashMap<>();

        stdAges.put("Ali Can",13);
        stdAges.put("Tom Hanks",46);
        stdAges.put("Brad Pit",55);
        stdAges.put("Angelina Julie",48);
        System.out.println(stdAges);

        Set<String> keys= stdAges.keySet();
        System.out.println(keys);

       Collection<Integer>  ages= stdAges.values();
        System.out.println(ages);

       Integer tomAge= stdAges.get("Tom Hanks");
        System.out.println(tomAge);

       Integer unKnown= stdAges.getOrDefault("Abc", 0);
        System.out.println(unKnown);

        System.out.println();

       Integer result1=stdAges.remove("Brad Pit");
        System.out.println(result1);
        System.out.println(stdAges);

      Boolean result2=stdAges.remove("Ali Can",13) ;
        System.out.println(result2);
        System.out.println(stdAges);

        System.out.println();

      Integer res1=  stdAges.replace("Tom Hanks", 56);
        System.out.println(res1);
        System.out.println(stdAges);
      Boolean res2 = stdAges.replace("Tom Hanks",56,66) ;
        System.out.println(res2);
        System.out.println(stdAges);

        System.out.println();

        Set<Map.Entry<String,Integer>> entries=stdAges.entrySet();
           for(Map.Entry<String,Integer> w : entries){
              System.out.print(w+ "! ");
           }


        System.out.println(entries);





    }
}
