package com.company.factory;

public class Mercedes implements Car{
    @Override
    public void start() {
        System.out.println("Mercedes is started...");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes is stopped...");
    }
}
