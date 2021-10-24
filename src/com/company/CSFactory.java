package com.company;

public class CSFactory implements ShopFactory{
    @Override
    public Shop createShop() {
        return new ClothingStore();
    }
}
