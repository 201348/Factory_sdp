package com.company;

public class ShoeStore implements Shop{
    @Override
    public void sellsSomething() {
        System.out.println("shoes are sold here");
    }
}
