package day25review;

public class E05 {
    public static void main(String[] args) {
       char r1= getCharFromString("Java",6);
        System.out.println(r1);

    }

    //create a method to get any character from a string
    public static char getCharFromString(String str,int idx){
        char i=' ';
        try{
           i= str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("A problem occur while using index for string");
            System.out.println(e.getMessage());
        }
        return i;
    }
}
