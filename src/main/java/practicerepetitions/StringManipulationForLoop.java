package practicerepetitions;

public class StringManipulationForLoop {
    public static void main(String[] args) {

        String str= "Ali is 13 years old, I think he is 15.";
        //remove all space character from the string

       String noSpace= str.replace(" " ,"");
        System.out.println(noSpace);

        // change digit to *

       String noDigit= str.replace("13", "**").replace("15", "**");
        System.out.println(noDigit);//this is a hard coding which is not good code because this runs just for specific data

      //  2.way
        String noDigitDynamic=str.replaceAll("[0-9]" ,"*");
        System.out.println(noDigitDynamic);//this is good coding

     //   example change all letters to !

      String noLetter=  str.replaceAll("[A-Za-z]" , "!");
        System.out.println(noLetter);

        //Change all character different from letters to ?
       String differentFromLetters =str.replaceAll("[^A-Za-z]", "?");
        System.out.println(differentFromLetters);

        //Change all character different from digits to *

        String differentFromDigits=str.replaceAll("[^0-9]" , "*");
        System.out.println(differentFromDigits);

        //Change all character different from spaces to *
        // 1.way
        String differentFromSpaces1=str.replaceAll("[^ ]" , "*");
        System.out.println(differentFromSpaces1);
        //2.way
        /*
        Important Note: \\s means space character
                        \\S  means different from space
                        \\d means digit character
                        \\D means different from digit
                        \\w means A-Z and a-z and 0-9 and underscore _
                        \\W different from those
                        \\p{Punct} means all punctuation  marks
         */
        String differentFromSpace2=str.replaceAll("\\S","*");
        System.out.println(differentFromSpace2);

        //example how many character are used in the string different from space
        int numberOfCharacter= str.replaceAll("\\s", "").length();
        System.out.println(numberOfCharacter);

        //example how many digits used in the string
       int numberOfDigits= str.replaceAll("\\D","").length();
        System.out.println(numberOfDigits);

       // 9.examples how many letters used in the string
       int numberOfLetters= str.replaceAll("[^A-Za-z]" , "").length();
        System.out.println(numberOfLetters);

       // 10.Example :how many punctuation marks are used in the string

        int totalNumberOfCharacters=str.length();

        int numOfCharsDifferentFromPunctuationMarks=str.replaceAll("\\p{Punct}" ,"").length();

        int numOfPunctuationMarks=totalNumberOfCharacters-numOfCharsDifferentFromPunctuationMarks;

        System.out.println(numOfPunctuationMarks);



    }

}
