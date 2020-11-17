package com.ua.creational.singleton;

public class BillPughSingleton {
    private int data = 0;

    private static class SingletonHelper {
        //Nested class is referenced after getInstance() is called
        private static final BillPughSingleton singleton = new BillPughSingleton();
    }

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.singleton;
    }
}
