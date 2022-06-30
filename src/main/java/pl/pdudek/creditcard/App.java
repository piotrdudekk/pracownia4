package pl.pdudek.creditcard;

import java.math.BigDecimal;

public class App {
    public static void main (String[] args){
        System.out.println("Hello World");

        CreditCard cc = new CreditCard();
        cc.assignLimit(BigDecimal.valueOf(1000));
        System.out.println("current limit: "+cc.getCurrentLimit);

    }
}
