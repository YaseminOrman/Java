package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01Review {
    public static void main(String[] args) {

        List<Integer>myList1=new ArrayList<>();
        myList1.add(12);
        myList1.add(10);
        myList1.add(8);
        System.out.println(myList1);
        myList1.add(1,80);
        myList1.add(2,50);
        System.out.println(myList1);

        //how to join two lists
        List<Character>a=new ArrayList<>();
        a.add('A');
        a.add('B');
        List<Character>b=new ArrayList<>();
        b.add('X');
        b.add('Y');
        b.add('Z');
        a.addAll(b);
        System.out.println(a);
        a.addAll(1,b);
        System.out.println(a);

        System.out.println(a.size());
        System.out.println(b.size());

        //Example 1: Type code to check if the given list is empty or not?
        List<Character>c=new ArrayList<>();
        c.add('x');
        c.add('y');
        boolean isEmpty=c.isEmpty();
        if(c.isEmpty()){
            System.out.println("the list is empty");
        }else{
            System.out.println("the list is not empty");
        }
        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element
        //           [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...
        List<String>d=new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add("a");
        System.out.println(d);
        List<String>e=new ArrayList<>();
        e.add(" ");

        d.removeAll(e);
        if(d.isEmpty()){
            System.out.println("The list is empty or just has space character");
        }else{
            System.out.println("The list has character different from space");
        }

    }
}
