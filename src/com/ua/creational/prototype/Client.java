package com.ua.creational.prototype;

public class    Client {
    public static void main(String[] args) {
        ShapeCache.loadChache();

        try {
            Shape clonedShape = (Shape) ShapeCache.getShape("1");
            System.out.println("Shape : "+ clonedShape.getType());

            Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
            System.out.println("Shape : "+ clonedShape2.getType());

            Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
            System.out.println("Shape : "+ clonedShape3.getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
