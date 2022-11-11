package practicewithmssara3;

import java.time.LocalDate;

public class MarketProductExpirationDate {

        //Type code to receive the name, price and expiration date of the product
        String productName;
        double productPrice;
        String expirationDate;

    public MarketProductExpirationDate(String name, double price,int monthLeft) {
        productName = name;
        productPrice = price;
        expirationDate= LocalDate.now().plusMonths(monthLeft).toString();

    }

    public MarketProductExpirationDate(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}

