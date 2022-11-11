package day16lists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02Review {
    public static void main(String[] args) {
        //Example 8: Type code to increase all salaries 10 percent in an Integer List
        //           [5000, 6000, 4500, 3900, 7200]
        List<Integer> a =new ArrayList<>();
        a.add(5000);
        a.add(6000);
        a.add(4500);
        a.add(3900);
        a.add(7200);

        for(int i=0 ; i<a.size();i++){
            a.set(i,a.get(i)*11/10);
            }
        System.out.println(a);

        //How to check if two lists are same or not

        List<Integer>b=new ArrayList<>();
        b.add(12);
        b.add(8);
        b.add(4);
        List<Integer>c=new ArrayList<>();
        c.add(12);
        c.add(8);
        c.add(4);
        if(b.equals(c)){
            System.out.println("The lists are same ");
        }else{
            System.out.println("The lists are not same");
        }

        //How to check if a list contains multiple elements
        //[12, 23, 32, 14] ==> Check if the list has 23, 32
        List<Integer>d=new ArrayList<>();
        d.add(12);
        d.add(23);
        d.add(32);
        d.add(14);
        List<Integer>e=new ArrayList<>();
        e.add(23);
        e.add(32);

        boolean isExist = d.containsAll(e);
        System.out.println(isExist);

        //Example 1: Type code to remove the first occurrence of a specific element from a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

        //To remove first occurrence Java created a method which is "remove()"
        List<String>f=new ArrayList<>();
        f.add("Shoes");
        f.add("TV");
        f.add("Laptop");
        f.add("Shoes");
        f.add("Book");
        f.add("Shoes");
        f.remove("Shoes");
        System.out.println(f);

        //Example 2: Type code to remove all occurrences of a specific element from a String list
        //           ["Shoes", "TV",  "Laptop", "Shoes", "Book" , "Shoes"]

        List<String>g=new ArrayList<>();
        g.add("Shoes");
        g.add("TV");
        g.add("Laptop");
        g.add("Shoes");
        g.add("Book");
        g.add("Shoes");

        List<String>h=new ArrayList<>();
        h.add("Shoes");
        h.add("Laptop");

        g.removeAll(h);
        System.out.println(g);

        g.remove(0);
        System.out.println(g);

        //Example 5: Create an Integer list, then remove the first occurrence of 4
        List<Integer> k = new ArrayList<>();
        k.add(12);
        k.add(4);
        k.add(10);
        k.add(16);
        k.add(11);
        k.remove(4);
        k.remove(Integer.valueOf(4));
        System.out.println(k);

        boolean isExist1=k.contains(10);
        System.out.println(isExist1);

        k.set(2,80);
        System.out.println(k);













    }
}
