package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collections;

public class Lists02Review {
    public static void main(String[] args) {
        //Example 1: Find the closest 2 integers in the given list. [12, 15, 10, 21]

        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(16);
        Collections.sort(a);
        System.out.println(a);
        int minDiff = a.get(1) - a.get(0);

        for (int i = 1; i < a.size(); i++) {
            minDiff=Math.min(minDiff, a.get(i)-a.get(i-1));
        }
        System.out.println(minDiff);
        for(int i=1;i<a.size();i++){
            if(minDiff==a.get(i)-a.get(i-1)){
                System.out.println(a.get(i)  + " and "+ a.get(i-1));
            }
        }
    }
}