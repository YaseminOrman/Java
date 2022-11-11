package day25review;

public class E03 {
    public static void main(String[] args) {

        System.out.println(getNumOfChar(null));
    }
    //create a method to find the number of characters in a string
    public static int getNumOfChar(String str){
        int x=0;
        try{
            x=str.length();
        }catch(NullPointerException e){
            System.out.println("A problem occurs in string");
        }
        return x;
    }
}
