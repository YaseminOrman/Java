package day25review;

public class E01 {
    public static void main(String[] args) {
        divide(6,0);

        divide2(6,0);
    }
    //1.way  we do not recommend this way
    public static void divide(int a,int b){
        if(b==0){
            System.out.println("A number can not be divided by zero");
        }else{
            System.out.println(a/b);
        }
    }

    //2.way handle exception by using try catch block
    public static void divide2(int a,int b){

        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("A problem occured in division");
        }
    }

}
