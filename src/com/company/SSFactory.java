package com.company;

public class SSFactory implements ShopFactory{
    @Override
    public Shop createShop() {
        return new StationeryStore();
    }
}
