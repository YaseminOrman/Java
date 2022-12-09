package mentorinterviewmyanswersday10_11_12;

import java.util.Scanner;

public class Q10_11 {
    public static void main(String[] args) {
//        10) Username is "admin", Password is "pwd123"
//        Ask user to enter username and password
//        User should see "Enter your username and password" message
//        hIf user enters correct credentials, e should get "You are in your account!" message
//        Otherwise, he should see "Enter your username and password" message 3 times
//        After 3 times he should get "Your account is blocked" message

      //  Scanner scan =new Scanner(System.in);



//         int count =1;
//         while(count<4){
//             System.out.println("Enter your username");
//             String uName=scan.nextLine();
//             System.out.println("Enter your password");
//             String pwd=scan.nextLine();
//             if(uName.equals("admin") && pwd.equals("pwd123")){
//                 System.out.println("You are in your account!");
//                 break;
//             }else{
//                 System.out.println("Please try again");
//             }
//             count++;
//             System.out.println("Your account is blocked");
//         }








//        11)Type code to check if a given integer is palindrome or not
//        Palindrome: 121 <==> 121  123321 <==> 123321 nalan <==>nalan

         String str="121";
         String rev="";
         for(int i =str.length()-1;i>=0;i--){
             rev= rev + str.charAt(i);
         }
        if(rev.equals(str)){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not polindrome");
        }





    }
}
