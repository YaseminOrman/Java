package mentorinterviewques_answers;

public class Day_6 {
}
/*

     Interview question day06stringmanipulations://Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique
        String m = "Hello";

        //1.Way:
        if(m.indexOf('l')==-1){
            System.out.println("The character does not exist");
        } else if(m.indexOf('l')==m.lastIndexOf('l')){
            System.out.println("The character is unique");
        }else{
            System.out.println("The character is not unique"); //2.Way:
        String res = m.indexOf('l')==-1 ? "The character does not exist" : (m.indexOf('l')==m.lastIndexOf('l') ? "The character is unique" : "The character is not unique");
        System.out.println(res);




       Day 7: Interviewee Question:
            Regex means "Regular Expressions"
            Regex represents a group of data
               All digits: [0-9]
               All lowercase letters: [a-z]
               All uppercase letters: [A-Z]
               All lower and uppercase letters: [a-zA-Z]
               All lower and uppercase letters and digits: [a-zA-Z0-9]
               Some multiple characters like a, e, i, o, u: [aeiou]
               All characters different from digits:[^0-9]
               All characters different from letters:[^a-zA-Z]
               All characters are different from vowels:[^aeiou]
               Space character: \\s
               All characters are different from space characters: \\S




 */