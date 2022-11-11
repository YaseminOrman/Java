package questionbankpractice;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {


        //   1) Find the middle element in an integer array
        //  Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        //  (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
        int arr[] = {5, 8, 12, 13};
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            int idxOfMiddle = arr.length / 2;
            System.out.println(arr[idxOfMiddle]);
        } else {
            int idxOfMiddle = arr.length / 2;
            int averageOfNumber = (arr[idxOfMiddle] + arr[idxOfMiddle - 1]) / 2;
            System.out.println(averageOfNumber);
        }

        //  2) Find the smallest positive element and greatest negative element in an integer array
        //  Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, and greatest negative is -2

        // 3) Find the elements whose length is the smallest in a String array
        //  Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String names[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        Arrays.sort(names, Comparator.comparingInt(String::length));
        int minLen=names[0].length();
        for (int i=0 ; i< names.length;i++) {
            if(minLen>names[i].length()){
                System.out.println(names[i].length());
            }

        }


    }

    }


