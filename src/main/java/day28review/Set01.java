package day28review;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        HashSet<String>emails = new HashSet<>();
        System.out.println(emails);

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add(null);
        System.out.println(emails);

        emails.remove("Fig");
        System.out.println(emails);

        System.out.println();

        Object emails2 =emails.clone();
        System.out.println(emails2);

        HashSet<String>emails3= (HashSet<String>) emails.clone();
        System.out.println(emails3);
        System.out.println();

        //LinkedHashSet
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123);
        ssn.add(234);
        ssn.add(null);
        System.out.println(ssn);

        System.out.println();
        //TreeSet
        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        System.out.println(nums1);

        Long middle =LocalTime.now().toNanoOfDay();
       HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);
        System.out.println(nums2);

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.way: " + (middle-starting));
        System.out.println("2.way: " + (ending-middle));





    }
}
