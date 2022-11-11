package practicewithmssara3;

public class RunnerForMarketProduct {
    public static void main(String[] args) {

        MarketProductExpirationDate obj1= new MarketProductExpirationDate("Cheese",24.99,10);
        System.out.println(obj1.productName+" "+obj1.productPrice+"$  "+ obj1.expirationDate);

        MarketProductExpirationDate obj2=new MarketProductExpirationDate("Milk",4.99);
        System.out.println(obj2.productName+" "+obj2.productPrice+"$ ");

        MarketProductExpirationDate obj3=new MarketProductExpirationDate("Salt",3.5);
        System.out.println(obj3.productName+" "+obj3.productPrice+"$ ");

    }
}
