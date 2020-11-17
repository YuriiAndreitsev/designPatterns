package com.ua.structural.decorator;

public class Client {
    public static void main(String[] args) {
        ConcreteComponenet concreteComponenet = new ConcreteComponenet();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();

        decoratorA.setComponent(concreteComponenet);
        decoratorA.doJob();

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(decoratorA);
        decoratorB.doJob();
    }
}
