package springpracticeexception;

public class ClassCastException {
    public static void main(String[] args) {

        Object obj1=12;
       convert(obj1);//if some data types can not be converted to another data types java throws that exception

        String str1="12a";
        convertStringToInteger(str1);

        String str2="";
        convertStringToInteger(str2);
    }
    public static void convert(Object obj){

        try {
            String convertedString = (String) obj;
            System.out.println(convertedString);
        }catch(java.lang.ClassCastException e){
            System.out.println("Some data types can not be converted to other data types -"+e.getMessage());
        }
    }
    public static void convertStringToInteger(String str){

        try {
            int parsedString = Integer.parseInt(str);
            System.out.println(parsedString);
        }catch(NumberFormatException e){
            System.out.println(str +" could not parsed to integer,because it has characters different from digit "+e.getMessage());
        }
    }

}
