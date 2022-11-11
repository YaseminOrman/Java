package springpracticemultidimensionalaray;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

       //How to create an Arraylists
        //1.way
        ArrayList<Integer>al1=new ArrayList<>();

        //2.way
        ArrayList<Integer>al2=new ArrayList<Integer>();

        //3.way
        List<Integer> al3=new ArrayList<>();
        System.out.println(al1);

     //   How to add elements into an arraylist
        al1.add(10);
        al1.add(9);
        al1.add(12);
        System.out.println(al1);
        al1.add(1,99);
        System.out.println(al1);

        //How to get number of elements in an arraylist

       int numOfElements= al1.size();
        System.out.println(numOfElements);
        System.out.println(al2.size());

        if(al1.size()==0){
            System.out.println("It is empty");
        }else{
            System.out.println("it is not empty");
        }
        //2.way
        if(al1.isEmpty()){
            System.out.println("It is empty");
        }else {
            System.out.println("it is not empty");
        }
        //How to check if an arraylist has just space in it
        List<String>al4=new ArrayList<>();
        al4.add(" ");
        al4.add("a");

        for(String w : al4){
          if(w.equals(" ")) {
              System.out.println("There is space" );
              break;
          }
        }

        //create a string arraylist add 5 element into it remove the elements whose length is less than 5

        List<String>al5=new ArrayList<>();
        al5.add("Ali");
        al5.add("Selim");
        al5.add("Lily");
        al5.add("Jasmin");
        al5.add("Noor");

        al5.remove("Noor");

        al5.remove(1);
        System.out.println(al5);

        ArrayList<Integer>al6=new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(11);
        al6.add(18);

        al6.remove(2);
        System.out.println(al6);
    }


}
