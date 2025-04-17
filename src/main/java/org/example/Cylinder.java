package org.example;

public class Cylinder{
    private Circle circle;
    private double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        circle = new Circle(radius);
    }

    public Cylinder(Circle circle, double height) {
        this.height = height;
        this.circle = circle;
    }

    public double getVolume2(){
        return circle.getArea() * height;
    }
    
    public double getVolume(){
        return circle.getArea() * height;
    }
}
