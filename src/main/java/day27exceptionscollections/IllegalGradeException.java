package day27exceptionscollections;
//To make a class exception class make it child of the exception class by using extends keyword
//If you use extend exception it will be "Compile time exception"
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }

}
