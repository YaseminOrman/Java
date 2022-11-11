package day18datetimeclassvarargs;

public class Varargs01Review {
    public static void main(String[] args) {

        System.out.println(add(3,5,2));

        System.out.println(add(3,5));

    }

    //Create a method adds two integers
    public static int add(int... a){
        int sum =0;
        for(int w:a){
            sum=sum+w;
        }
        return sum;
    }


}
