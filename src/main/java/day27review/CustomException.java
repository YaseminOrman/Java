package day27review;

import day27exceptionscollections.IllegalGradeException;

public class CustomException {
    public static void main(String[] args) {

        try {
            printGrade(45);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkNameFormat("tom");
        }catch(IllegalNameException e){
            System.out.println(e.getMessage());
        }

    }

  public static void printGrade(double grade) throws IllegalGradeException {
      if(grade<0 || grade>100){
          throw new IllegalGradeException("Grade can not be less than 0 and grater than 100");
      }else{
          System.out.println(grade);
      }
  }
  public static boolean checkNameFormat(String name){
        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("Names must start with upper cases");
        }
  }
}
