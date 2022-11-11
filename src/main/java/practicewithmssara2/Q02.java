package practicewithmssara2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02 {
    /*
     * create a method accepts a name as parameter
     * and prints the name as a char array
     *
     * (do not use toCharArray() method)
     *
     * Input : John
     * Output : [J, o, h, n]
     */
    public static void main(String[] args) {

        String name ="John";
        getNameAsAChar(name);
    }
    public static void getNameAsAChar(String name){
       char c[]=new char[name.length()];
         int idx=0;
        for(int i=0;i<name.length();i++){
          c[idx]=name.charAt(i);
          idx++;
        }
        System.out.println(Arrays.toString(c));

    }
}
