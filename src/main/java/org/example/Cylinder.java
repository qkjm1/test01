package org.example;

public class Cylinder{
    private Circle circle;
    private double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        circle = new Circle(radius);
    }
    
    public double getVolume(){
        return circle.getArea() * height;
    }
}
