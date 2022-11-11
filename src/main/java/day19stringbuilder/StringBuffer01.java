package day19stringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        string buffer is another class to create strings in java
        it is very similar with string buffer class.both are mutable

        what is the difference between them
        1)StringBuffer was created before StringBuilders in java
        2)StringBuffer is multi-tread but StringBuilders is not
        3)StringBuffer is slower than StringBuilders

        Scenarios:
        1)I need immutable String ==>string class
        2)I need mutable and not multi-tread ==>StringBuilder
        3)I need mutable and  multi-tread ==>StringBuffer

        When you use multi-tread you need to create an order for the threads,this called "synchronization"
         */
    }
}
