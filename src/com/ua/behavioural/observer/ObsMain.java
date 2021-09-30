package com.ua.behavioural.observer;

public class ObsMain {
    public static void main(String[] args) {
        PCLNewsAgency newsAgency = new PCLNewsAgency();

        PCLNewsChannel onePlusOne = new PCLNewsChannel();
        PCLNewsChannel ictv = new PCLNewsChannel();
        PCLNewsChannel ukraine = new PCLNewsChannel();

        newsAgency.addPropertyChangeListener(onePlusOne);
        newsAgency.addPropertyChangeListener(ictv);
        newsAgency.addPropertyChangeListener(ukraine);

        newsAgency.setNews("Today is a good day");

        System.out.println("1+1 : "+ onePlusOne.getNews());
        System.out.println("ictv : "+ ictv.getNews());
        System.out.println("ukraine : "+ ukraine.getNews());

        newsAgency.setNews("No barking from a dog... no smog... ");

        System.out.println("1+1 : "+ onePlusOne.getNews());
        System.out.println("ictv : "+ ictv.getNews());
        System.out.println("ukraine : "+ ukraine.getNews());
    }
}
