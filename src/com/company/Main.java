package com.company;

import java.security.PrivateKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShopFactory factory;
        factory = new CSFactory();
        Shop shop = factory.createShop();
        shop.sellsSomething();

        factory = new SSFactory();
        shop = factory.createShop();
        shop.sellsSomething();

        factory = new TSFactory();
        shop = factory.createShop();
        shop.sellsSomething();

        factory = new ShSFactory();
        shop = factory.createShop();
        shop.sellsSomething();

    }
}
