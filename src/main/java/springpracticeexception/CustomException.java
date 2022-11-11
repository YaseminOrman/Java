package springpracticeexception;

public class CustomException {
    public static void main(String[] args) throws illegalGradeException {

        checkGrade(105);

    }
    //If you create an exception it is called Custom Exception
    //Create illegalGradeException grades are from zero to 100
    //If the grade is less than zero or greater than 100 illegalGradeException  will be thrown

    static class illegalGradeException extends Exception{
        public illegalGradeException(String message){
            super(message);

        }
    }
    public static void checkGrade(int grade) throws illegalGradeException {
        if(grade<0 || grade>100){
            throw new illegalGradeException(grade +" is not between 0 and 100 but it must...");
        }
        System.out.println("Your grade is "+grade );
    }

}
