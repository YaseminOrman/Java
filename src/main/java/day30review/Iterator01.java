package day30review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);

       list1.iterator();
        //Example 1: Update every element by putting "!" to end
        ListIterator<String> itr = list1.listIterator();
        while(itr.hasNext()){
          String el = itr.next();

          itr.set(el + "*");
        }
        System.out.println(list1);

        while(itr.hasPrevious()){
            String el1=itr.previous();
            itr.remove();
        }
        System.out.println(list1);

        Iterator<String> itr1 =  list1.iterator();
        while(itr1.hasNext()){
          itr1.next();
           itr1.remove();
        }
        System.out.println(list1);


    }
}
