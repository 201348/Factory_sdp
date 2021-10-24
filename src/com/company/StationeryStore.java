package com.company;

public class StationeryStore implements Shop{
    @Override
    public void sellsSomething() {
        System.out.println("stationery is sold here");
    }
}
