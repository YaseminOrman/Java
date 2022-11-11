package practicerepetitions;

public class StringManipulationRemovingSpaces {
    public static void main(String[] args) {

        //How to move spaces from beginning and end in a string

        String fullName="   Ali Can   ";
        System.out.println(fullName);
       String trimmedName= fullName.trim();
        System.out.println(trimmedName);

        //how to understand if the string is empty or not
     // 1.way
        int numOfChars =fullName.length();
        if(numOfChars==0){
            System.out.println("You did not enter your name");
        }else{
            System.out.println("You entered your name successfully");
        }
        //2.way
      boolean isEmpty=  fullName.isEmpty();
        if(isEmpty){
            System.out.println("You did not enter your name");
        }else{
            System.out.println("You entered your name successfully");


            String str ="Ali 12 wooow!";
            // isBlank() returns true if there is space character or space characters or nothing
            boolean isBlank=str.isBlank();
            System.out.println(isBlank);
        }


    }
}
