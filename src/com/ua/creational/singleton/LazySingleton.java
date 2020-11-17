package com.ua.creational.singleton;

public class LazySingleton {

    private static LazySingleton lazySingletonInstance = null;

    private int data = 0;

    private LazySingleton() {    }

    public static LazySingleton getInstance (){
        if (lazySingletonInstance == null){
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    //add and set data
}
