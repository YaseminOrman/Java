package day30review;

import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {

        //Example 1: Store students names together with their email addresses, ages, grades, nationality
        //           Tom Hanks = th@gmail.com, 21, 2, American


        Hashtable<String,Students> studentInfo = new Hashtable<>();
        studentInfo.put("Tom Hanks",new Students("th@gmail.com",21,2,"American"));
        studentInfo.put("Yasmin Orman",new Students("yo@gmail.com",20,1,"Turkish"));
        studentInfo.put("Brad Pit",new Students("bp@gmail.com",23,4,"Colombian"));
        System.out.println(studentInfo);

       Students tomInfo= studentInfo.get("Tom Hanks");
        System.out.println(tomInfo.age);






    }
}
