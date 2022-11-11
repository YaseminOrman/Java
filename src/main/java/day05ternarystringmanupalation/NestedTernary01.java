package day05ternarystringmanupalation;

public class NestedTernary01 {

    public static void main(String[] args) {

      /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.==>1600,2000
        If a year is not divisible by 100 then it must be divisible by 4.==>2004,1996
 */
        int year =1600;

     String isLeap =   year%100==0 ? (year%400==0 ? "leap" : "not leap") : (year%4==0 ? "leap" : "not leap");

        System.out.println(isLeap);

        /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
*/

        String pwd = "M123";
        String isValid = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "Valid" : "Invalid") : (pwd.charAt(0)=='K' ? "Valid" : "Invalid");
        System.out.println(isValid);



    }
}
