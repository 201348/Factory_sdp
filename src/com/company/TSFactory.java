package com.company;

public class TSFactory implements ShopFactory{
    @Override
    public Shop createShop() {
        return new AToyShop();
    }
}
