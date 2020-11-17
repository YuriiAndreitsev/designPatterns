package com.ua.creational.singleton;

public class ThreadSafeSingleton {
    //private volatile static = double-cheked singleton principle (to reduce wait time)
    private static ThreadSafeSingleton threadSafeSingleton = null;

    private int data = 0;

    public ThreadSafeSingleton() {
    }

    //adding synchronized we make thead to wait before
    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    //DOUBLE-CHECKED PRINCIPLE GET INSTANCE
//    public static ThreadSafeSingleton getInstance() {
//        if (threadSafeSingleton == null) {
//            synchronized (ThreadSafeSingleton.class) {
//                if (threadSafeSingleton == null) {
//                    threadSafeSingleton = new ThreadSafeSingleton();
//                }
//            }
//        }
//        return threadSafeSingleton;
//    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    //add and set data
}
