package practicerepetitions;

public class concaStringMan {
    public static void main(String[] args) {
        String str ="Ali Can";
        String newStr=str.concat("!").concat("yes");
        System.out.println(newStr);

       boolean isLast= str.endsWith("n");
        System.out.println(isLast);

       boolean isFirst= str.startsWith("A");
        System.out.println(isFirst);

      boolean isTheForth=  str.startsWith("C" , 4);
        System.out.println(isTheForth);


    }
}
