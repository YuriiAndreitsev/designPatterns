package com.ua.structural.adapter;

public class Client {
    public static void main(String[] args) {
            Duck duck = new MallardDuck();
            Turkey turkey = new WildTurkey();

            Duck turkeyAdapter = new TurkeyAdapter(turkey);
            turkeyAdapter.quack();
            turkeyAdapter.fly();

            testDuck(duck);
            testDuck(turkeyAdapter);
    }

    static void testDuck (Duck duck){
        duck.quack();
        duck.fly();
    }
}
