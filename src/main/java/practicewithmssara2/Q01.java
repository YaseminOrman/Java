package practicewithmssara2;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {

      joinStrings();
        // Create a method that joins the given Strings
        // input => "Please", "join", "the", "given", "words"
        // output => "Please join the given words"
    }

    public static void joinStrings() {

        String s[] = {"Please", "join", "the", "given", "words",};
        String str=" ";
        for(int i =0; i<s.length;i++){
            str =s[i];
            System.out.print(str + " ");
        }

    }
}

//String str1= "Please", str2 = "join", str3= "the", str4="given", str5="words";
//        System.out.println(joinString("Please", "join", "the", "given", "words"));
//
//
//                }
//
//public static String joinString(String... str){
//
//        String sum= "";
//        for(String w : str){
//        sum = sum + w + " ";
//        }
//        return sum;
//
//        }


          //     String joinedString =String.join(" ",a);
         //        System.out.println(joinedString);