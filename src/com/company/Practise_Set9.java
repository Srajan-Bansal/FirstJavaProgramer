package com.company;

class cylinder {
    private int radius;
    private int height;

    public int getRadius() { return radius; }

    public void setRadius(int radius) { this.radius = radius; }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }

    public double surfaceArea() { return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height; }

    public double volume() { return Math.PI * radius * radius * height; }

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}

class rectangle1{
    private int length;
    private int breadth;

    public rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }
    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() { return length; }

    public int getBreadth() { return breadth; }
}

class sphere {
    private int radius;

    public sphere(int radius) { this.radius = radius; }

    public double surfaceArea() { return 4*Math.PI*radius*radius; }

    public double area(){ return 4/3*Math.PI*radius*radius*radius; }
}


public class Practise_Set9 {
    public static void main(String[] args) {

        // Problem 1
//        cylinder myCylinder = new cylinder();
//        myCylinder.setRadius(9);
//        myCylinder.setHeight(12);

//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.getHeight());

        // Problem 2
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());

        // Problem 3
//        cylinder myCylinder = new cylinder(9,12);

//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.getHeight());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());

        // Problem 4
//        rectangle1 r = new rectangle1(10,11);

//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());

        // Problem 5
        sphere s = new sphere(10);

        System.out.println(s.surfaceArea());
        System.out.println(s.area());
    }
}
