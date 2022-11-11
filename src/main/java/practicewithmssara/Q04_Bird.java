package practicewithmssara;

public class Q04_Bird extends Q04_Animal{

    public void tweet(){
        System.out.println("Birds tweet...");
    }


    @Override
    public void weight() {
        System.out.println("Bird are very light animals");
    }
}
