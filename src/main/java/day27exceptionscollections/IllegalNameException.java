package day27exceptionscollections;
//When you extend to RunTimeException class your custom exception will be RunTimeException
public class IllegalNameException  extends RuntimeException{

    public IllegalNameException(String message){
       super(message) ;
    }
}
