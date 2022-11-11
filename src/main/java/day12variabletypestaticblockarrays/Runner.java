package day12variabletypestaticblockarrays;

public class Runner {
    public static void main(String[] args) {
       //To access a non-static variable you have to create object
        VariableType01 obj =new VariableType01();
        System.out.println(obj.name);

        //Actually you can access to static class members by using object it is not recommended
        System.out.println(obj.age);//13 not recommended

        //to access a static variable no need to create object just class name is enough
        System.out.println(VariableType01.age); //13

        System.out.println(obj.add(3,5));

        System.out.println(obj.multiply(4,6));


    }
}
