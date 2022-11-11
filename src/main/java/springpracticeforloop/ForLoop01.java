package springpracticeforloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //example type code to print a String in reverse after removing spaces.
        //for example Ali Can ==> naCilA
        String u = "Ali Can ";

      String noSpace=  u.replace(" ","");
      for(int i =noSpace.length()-1; i>-1 ; i--){
          System.out.print(noSpace.charAt(i));

      }
        System.out.println();

      //example  type code to find the sum of the integers from 12 to 231
        int sum = 0;
        for(int i=12; i<232 ; i++){
           sum = sum +i;
        }
        System.out.println(sum);

        System.out.println();

       // example type code to find the multiplication  of the integers from 3 to 5

        int multiply =1;
        for( int i = 3 ; i<6 ; i++){
            multiply=multiply*i;
        }
        System.out.println(multiply);

        System.out.println();

        //Example Type the code to check if a given string is Palindrome
        //String:anna reversed string : anna
        //integer :12321   reversed integer : 12321
        String s = "radar";
        String reversedS="";
        for(int i = s.length()-1 ; i>-1 ; i--){
            reversedS=reversedS+s.charAt(i);
        }
        if(s.equals(reversedS)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome ");
        }
        System.out.println();

        //Example Type the code to check if a given integer is Palindrome
        //integer :12321   reversed integer : 12321
        int num =132;
        String stringFromNum=String.valueOf(num);
        String reversedNum="";
        for(int i=stringFromNum.length()-1 ; i>-1 ; i--) {
            reversedNum = reversedNum + stringFromNum.charAt(i);
        }
            if (stringFromNum.equals(reversedNum)) {
                System.out.println("palindrome");
            } else {
                System.out.println("Not palindrome");
            }







    }
}
