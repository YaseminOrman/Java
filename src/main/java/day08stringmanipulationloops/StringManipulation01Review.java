package day08stringmanipulationloops;

public class StringManipulation01Review {
    public static void main(String[] args) {

        String str ="Java is easy. Java is OOP.";
       String result1= str.replaceFirst("Java" , "Apex");
        System.out.println(result1);
       String result2=str.replace("Java", "Apex");
        System.out.println(result2);

        /*
        String shirtPrice = "$12.99";
      String bookPrice = "$35.99";
      Type code to find the sum of the shirt and book prices.
         */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

      String shirt=  shirtPrice.replace("$", "");
        System.out.println(shirt);
      String book=bookPrice.replace("$", "");
        System.out.println(book);

     double shirtInDouble= Double.valueOf(shirt);
     double bookInDouble = Double.valueOf(book);

        System.out.println("Total price is  " + (shirtInDouble+bookInDouble));

        //Example 2 Swap the integers
        //     x=12  y=23  ==>   x=23   y=12

        int x=12 ,y=23;
        y=y-x;
        x=x+y;
        y=x-y;
        System.out.println(x);
        System.out.println(y);


    }
}
