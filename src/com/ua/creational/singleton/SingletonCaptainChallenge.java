package com.ua.creational.singleton;

public class SingletonCaptainChallenge {
    public static void main(String[] args) {

        System.out.println("selecting a captain");
        CaptainSingleton c1 = CaptainSingleton.getInstance();
        System.out.println("trying to choose another one");
        CaptainSingleton c2 = CaptainSingleton.getInstance();
        System.out.println("Comparing two captains: "+ (c1 == c2));

    }
}
