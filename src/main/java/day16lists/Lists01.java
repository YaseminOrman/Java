package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //How to create a list(ArrayList)

        //1.way
        ArrayList<Integer> myList1=new ArrayList<Integer>();

        //2.way
        ArrayList<Integer> myLis2t=new ArrayList<>();

        //3.way
        List<Integer> myList3=new ArrayList<Integer>();

        //How to print a list on the console
        System.out.println(myList3);

        //How to add elements into a list
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);

        System.out.println(myList3);

        myList3.add(1,50);
        System.out.println(myList3);

        myList3.add(3,99);
        System.out.println(myList3);

        //How to join two lists
        List<String>a=new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String>b=new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);
        System.out.println(b);

        a.addAll(1,b);
        System.out.println(a);

        //How to get the number of elements on a list
        int sizeOfA= a.size();
        System.out.println(sizeOfA);
        int sizeOfB= a.size();
        System.out.println(sizeOfB);

        //Note: When you talk about the number of the elements in an Array use "length of the array", for the lists use "size of the list"

        //Example 1: Type code to check if the given list is empty or not?
       List<Character>c=new ArrayList<>();
       c.add('x');
       c.add('y');

       int sizeOfC=c.size();

       if(sizeOfC==0){
           System.out.println("The list is empty");
       }else{
           System.out.println("This is not empty");
       }
       //2.way java created a method to check if a list is empty or not
        //isEmpty method returns true if the list has no any elements
        //isEmpty method returns false if the list has at least one element
       boolean isEmpty= c.isEmpty();
       if(isEmpty){
           System.out.println("The list is empty");
       }else{
           System.out.println("This is not empty");
       }

        //Note: If Java has a method for specific functionality using the method is preferable

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element
        //           [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...
        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        //d.add("a");
        System.out.println(d);// [ , , , a]

        //To be able to use removeAll() method you need List, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
        e.add(" ");

        //removeAll() method is used to remove multiple elements from a List
        //When you use removeAll() method, you will need a list stores the elements you want to remove
        d.removeAll(e);
        System.out.println(d);// [a]

        if(d.isEmpty()){
            System.out.println("The list is empty or has just space character");
        }else{
            System.out.println("The list has character/s different from space");
        }





    }
}
