package day27review;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String>visitors =new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Marry");
        visitors.add("Carl");
        visitors.add("Ali");
        System.out.println(visitors);

        visitors.addLast("Yasmin");
        System.out.println(visitors);

        visitors.addFirst("Selim");
        System.out.println(visitors);

        LinkedList<String>kids =new LinkedList<>();
        kids.add("Nilufer");
        kids.add("Lily");

        visitors.addAll(kids);
        System.out.println(visitors);

        visitors.add(2,"Miami");
        System.out.println(visitors);

        visitors.addAll(6,kids);
        System.out.println(visitors);

        visitors.remove(2);
        System.out.println(visitors);

        visitors.remove("Carl");
        System.out.println(visitors);

        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("Ali");
        System.out.println(visitors);



    }
}
