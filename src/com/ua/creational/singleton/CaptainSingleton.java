package com.ua.creational.singleton;

public class CaptainSingleton {

    private int data = 0;

    private static class CaptainSelector {
        private static final CaptainSingleton captain = new CaptainSingleton();
    }

    private CaptainSingleton() {

    }

    public static CaptainSingleton getInstance(){
        System.out.println("captain selected!");
        return CaptainSelector.captain;
    }
}
