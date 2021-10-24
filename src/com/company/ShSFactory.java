package com.company;

public class ShSFactory implements ShopFactory{
    @Override
    public Shop createShop() {
        return new ShoeStore();
    }
}
