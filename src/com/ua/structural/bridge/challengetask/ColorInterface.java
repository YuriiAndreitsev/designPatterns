package com.ua.structural.bridge.challengetask;

public interface    ColorInterface {
    void fillWithColor (int border);
}

class RedColor implements ColorInterface{
    @Override
    public void fillWithColor(int border) {
        System.out.println(" red with "+border+" border");
    }
}

class GreenColor implements ColorInterface{
    @Override
    public void fillWithColor(int border) {
        System.out.println(" green with "+border+" border");
    }
}