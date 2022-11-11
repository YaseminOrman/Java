package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets01 {
    /*
    1)Sets are for storing multiple non-primitive data in the same data type
    2)Sets are for storing unique data like email addresses ,SSN ,Phone numbers in a country ...
    3)There are 3 different Sets
        i)HashSet :Using "Hashing Technique".It does not put the elements in any order
                         HashSet accepts just a single "null" as element
        ii)LinkedHashSet:Puts the elements in "insertion Order"
        iii)TreeSet:Puts the elements in "Natural Order" (Ascending order for numbers ,alphabetical order for string)
             TreeSet is so slow in adding elements

     Question: If you need to store unique element  in natural order ,which collection do you use?
              answer:TreeSet
     Question:As you know , TreeSet is so slow in adding elements ,how can you improve you code?
             i)Create a HashSet
             ii) Add elements into the Hashset
             iii) Convert Hashset to TreeSet
     */

    public static void main(String[] args) {

        HashSet<String>emails=new HashSet<>();
        System.out.println(emails);

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        //If you want to add an element back to the HashSet, the old one is deleted and the new one is overwritten.
        //When you add same data java does not give any error ,and last data will be overwritten to the previous data
        emails.add("Mango");
        emails.add(null);
        emails.add(null);
        System.out.println(emails);

        emails.remove("Fig");
        System.out.println(emails);

       // emails.clear();
       // System.out.println(emails);

        //When you use clone method you can make data type "Object"
        Object emails2 = emails.clone();
        System.out.println(emails2);

        HashSet<String>emails3= (HashSet<String>) emails.clone();
        System.out.println(emails3);

        //LinkedHashSet

        LinkedHashSet<Integer> ssn= new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);

        System.out.println(ssn);

        //TreeSet
        //1.Way: Slower
        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        System.out.println(nums1);//[ -5, 5, 17, 23, 41, 67]

        Long middle = LocalTime.now().toNanoOfDay();

        //2.Way: Faster
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);

        Set<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);//[ -5, 5, 17, 23, 41, 67]

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " + (middle-starting));
        System.out.println("2.Way: " + (ending-middle));







    }
}
