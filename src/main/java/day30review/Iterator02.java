package day30review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        //Example 1: Increase the numbers in a List by 20 percent then print the elements in the reverse order of the given order
        //           [20, 60, 30, 100] ==> [24, 72, 36, 120] ==> [120, 36, 72, 24]
        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(60);
        myList.add(30);
        myList.add(100);

        ListIterator<Integer> myItr = myList.listIterator();

        while(myItr.hasNext()){
            Integer num =myItr.next();
            myItr.set(num*120/100);
        }
        Collections.reverse(myList);
        System.out.println(myList);









    }
}
