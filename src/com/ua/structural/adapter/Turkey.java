package com.ua.structural.adapter;

public interface Turkey {
    public void gobble();

    public void fly();
}

class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobbles!");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey flies away a short distance!");
    }
}
