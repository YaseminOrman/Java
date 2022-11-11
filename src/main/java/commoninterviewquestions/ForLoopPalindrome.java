package commoninterviewquestions;

public class ForLoopPalindrome {
    public static void main(String[] args) {

        //1)Example Type the code to check if a given string is Palindrome
        //String:anna reversed string : anna
        //integer :12321   reversed integer : 12321
        String s = "anna";
        String reversedS="";
        for(int i = s.length()-1 ; i>-1 ; i--){
            reversedS=reversedS+s.charAt(i);
        }
        if(s.equals(reversedS)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome ");
        }

        //2)Example Type the code to check if a given integer is Palindrome
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
