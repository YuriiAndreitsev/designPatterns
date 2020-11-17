package com.ua.structural.bridge.challengetask;

public class Client {
    public static void main(String[] args) {
        ColorInterface green = new GreenColor();
        ColorInterface red = new RedColor();
        Shape triangle = new Triangle(green);
        System.out.println("Coloring trianle:");
        triangle.drawShape(20);
        triangle.modifyBorder(20,3);

        Shape rectangle = new Rectangle(red);
        System.out.println("Coloring rectangle:");
        rectangle.drawShape(20);
        rectangle.modifyBorder(50,2);
    }
}
