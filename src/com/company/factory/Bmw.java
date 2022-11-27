package com.company.factory;

public class Bmw implements Car{
    @Override
    public void start() {
        System.out.println("Bmw is started...");
    }

    @Override
    public void stop() {
        System.out.println("Bmw is stopped...");
    }
}
