package springpracticearrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //How to create an array and put elements in one line

        int a[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(a));

        int b[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(b));

        // How to check if two arrays are same or not

        boolean areArraysSame = Arrays.equals(a, b);
        System.out.println(areArraysSame);

        //Type code to check if 2 arrays have same elements
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("Same Array");
        } else {
            System.out.println("Different Arrays");
        }

        //Type code to check if a specific element exist in an array or not

        int c[] = {-12, 3, 5, 0, 34};

        int num = -12;
        int counter = 0;

        for (int w : c) {
            if (w == num) {
              counter++;
              break;
            }
        }
        if(counter==0){
            System.out.println(num + " does not exist");
        }else{
            System.out.println(num + "  exist");
        }
    }
}
