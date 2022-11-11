package day12variabletypestaticblockarrays;

public class VariableType01 {

    //"name" is non-static or object or instance variable

    public String name = "Tom Hanks";

    //age is static or class variable
    public static int age = 13;

    //local variable
    //if you create a variable inside a method it is called local variable
    //Note when you create a local variable it is mandatory  to assign a value
    //if you try to use a local variable without assigning a value it complains

    //local variable can be used just inside the method
    //note: if you try to use outside the method it will give error
    //if the return type different from void
    //you have to use return keyword inside the method

    //use the return keyword in the last line
    //you can not type any code after return keyword
    public int add(int a, int b) {

        int x=12;//local variable
        return a + b;

    }
    public int multiply(int c,int d){

        String s= "Java";//local variable
        return c*d;
    }
}

