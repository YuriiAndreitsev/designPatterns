package com.ua.creational.singleton;

public class Client {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.setData(55);
        System.out.println(lazySingleton.getData());
        lazySingleton = null;
        lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.getData());
    }
}
