package day06StringManupulation;

public class StringManipulation02Review {

    public static void main(String[] args) {

        // example 1: Type code to see the order number of the first occurrence of the  character 'a'
        //"I want to learn java"

        String str ="I want to learn java";

       int idx = str.indexOf('a');//gives you index of first occurrence of a specific character

        System.out.println(idx+1);

        // example 1: Type code to see the order number of the first occurrence of java
        //"I like to study java, learn java,earn money, java is easy"

        String s = "I like to study java, learn java,earn money, java is easy";

        int i =s.indexOf("java");

        System.out.println(i+1);

       int t = s.indexOf('w');
        System.out.println(t);

        //Type code to check if a String has 'a' in it  or not Print appropriate messages for the scenarios
        //1.way
        String word="I like to study";

        if(word.indexOf('a')==-1){
            System.out.println("There is no 'a'");
        }else{
            System.out.println("There is  'a'");
        }
      //  2.way
      String result=  word.indexOf('a')==-1 ? "There is no 'a'" : "There is  'a'";
        System.out.println(result);

        //Type code to find the order number of last occurrence of java in a sentence

        String r = "I like to study java, learn java,earn money, java is easy";

       int f =r.lastIndexOf("java");
        System.out.println(f);

        //example type to check if a character is unique in a string or not

     //1.way
      String m= "Hello";
      if(m.indexOf('x')==-1) {
          System.out.println("The character does not exist");
      }else if(m.indexOf('x')==m.lastIndexOf('x')){
          System.out.println("The character is unique");
      }else{
          System.out.println("The character is not unique");
      }
      //2.way
      String res=m.indexOf('x')==-1 ? "The character does not exist" : m.indexOf('l')==m.lastIndexOf('l') ? "The character is unique" : "The character is not unique";
        System.out.println(res);



    }
}

