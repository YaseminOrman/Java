package springencapsulation;

public class EncapRunner {
    public static void main(String[] args) {

//            Students std1 =new Students();
//        System.out.println(std1.getName());
//        std1.setName("Veli Han");
//        System.out.println(std1.getName());
//
//        System.out.println(std1.getGrade());
//        System.out.println(std1.isSuccessful());

        Students std2 =new Students();
        Students std3 =new Students("Veli Han",10,false);
        Students std4 =new Students("Kemal Can ",8,true);

        //The best way:
        Students std5 =new Students();
        std5.setName("Ayse Han");
        std5.setGrade(7);
        std5.setSuccessful(true);

        std5.setName("Ayse Han");
        std5.setGrade(12);
        std5.setSuccessful(false);



    }
}
