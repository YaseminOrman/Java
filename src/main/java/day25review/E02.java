package day25review;

public class E02 {
    public static void main(String[] args) {
        String a[]={"A","B","C","D"};
        System.out.println(getElement(a,5));
    }
    //Create a method to get any element from a string Array
    //if return type is different from void we have to use return keyword
    public static String getElement(String a[],int idx){
      String s="";
        try{
            s= a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occured in Array indexes");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return s;

    }
}
