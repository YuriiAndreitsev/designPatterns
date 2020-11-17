package com.ua.structural.adapter;

public interface Duck {
    public void quack();

    public void fly();
}

class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("MallardDuck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck flies away!");
    }
}
