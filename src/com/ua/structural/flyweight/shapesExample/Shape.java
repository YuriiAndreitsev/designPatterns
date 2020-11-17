package com.ua.structural.flyweight.shapesExample;

public interface Shape {

    void draw(int x, int y);

}

class Point implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.println( "coordinates are x:"+x+"; y:"+y+" - Drawing a point;");
    }
}

class Circle implements Shape{
    double radius = 3.14;
    @Override
    public void draw(int x, int y) {
        System.out.println( "coordinates are x:"+x+"; y:"+y+" - Drawing a circle with a radius:"+radius);
    }
}
class Square implements Shape{
    int side = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println( "coordinates are x:"+x+"; y:"+y+" - Drawing a square with a side: "+side);
    }
}