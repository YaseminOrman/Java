package day27exceptionscollections;

public class CustomException01 {

    /*
    Normally java has many Exception classes which cover many issues
    Sometimes we need Custom Exception for 2 reasons
    1)To make Java exception more specific
        FileNotFoundException  has 2 reasons in it i)path can be wrong  ii)file does not exist
    2)To create some Exception for our application
       IllegalGradeException can be created for a school management system application

       Note:Custom Exception directs the devlopers not to break the application rules
     */
    public static void main(String[] args) {
        try {
            printGrade(45);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(checkNameFormat("Tom"));

    }
    public static void printGrade(double grade) throws IllegalGradeException {

        if(grade<0 || grade>100){
            throw new IllegalGradeException("grade can not be less than zero or more than hundred");
        }else{
            System.out.println(grade);
        }
    }

    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true ;
        }else{
            throw new IllegalNameException("Names must start with uppercase");
        }
    }
}
