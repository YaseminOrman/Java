package springpracticemultidimensionalaray;

import java.util.ArrayList;

public class Lists02 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(12);
        al1.add(13);
        al1.add(11);
        al1.add(18);
        al1.add(20);

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(98);
        al2.add(99);

        al1.addAll(al2);
        System.out.println(al1);

        al2.addAll(al1);
        System.out.println(al2);

        ArrayList<Integer> al3=new ArrayList<>();
        al3.add(111);
        al3.add(222);

        al2.addAll(4,al3);
        System.out.println(al2);

        al1.addAll(3,al3);
        System.out.println(al1);

        al2.removeAll(al3);
        System.out.println(al2);

        boolean b1 =al1.contains(98);
        System.out.println(b1);

        al2.clear();
        System.out.println(al2);

        al1.set(5,777);
        System.out.println(al1);
        //Change the elements less than 15 to 777
        for(Integer w : al1){
            if(w<15){
                al1.set(al1.indexOf(w), 777);
            }
        }
        System.out.println(al1);

        ArrayList<String>sl1=new ArrayList<>();
        sl1.add("Java");
        sl1.add("Lambda");

        ArrayList<String>sl2=new ArrayList<>();
        sl2.add("Java");
        sl2.add("Lambda");

       boolean b= sl1.equals(sl2);
        System.out.println(b);

        }
    }

