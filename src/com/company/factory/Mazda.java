package com.company.factory;

public class Mazda implements Car{
    @Override
    public void start() {
        System.out.println("Mazda is started...");
    }

    @Override
    public void stop() {
        System.out.println("Mazda is stopped...");
    }
}
