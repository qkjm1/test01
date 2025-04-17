package org.example;



public class Main {
    public static void main(String[] args) {


        Cylinder cylinder = new Cylinder(18,2);
        Cylinder cylinder2 = new Cylinder(new Circle(2.8),5.6);

        System.out.println("부피: "+cylinder.getVolume());
        System.out.println("부피: "+cylinder2.getVolume2());
    }
}

