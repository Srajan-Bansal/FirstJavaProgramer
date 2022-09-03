package com.company;

class circle2{
    public int radius;

    public circle2(){
        System.out.println("I am non para of circle");
    }
    public circle2(int r) {
        System.out.println("I am a circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder2 extends circle2{
    public int height;
    cylinder2(int r,int h){
        super(r);
        System.out.println("I am a cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.height*this.radius*this.radius;
    }
}

class Rectangle2{
    public int length;
    public int breadth;

    Rectangle2(int l, int b){
        System.out.println("Setting length and breadth of rectangle");
        this.breadth = b;
        this.length = l;
    }
    public int area(){
        return this.length*this.breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }


}
class Cuboid extends Rectangle2{
    public int a;


    Cuboid(int l, int h, int a){
        super(l,h);
        System.out.println("Setting side of cuboid");
        this.a = a;
    }
    public int volume(){
        return this.a*this.a*this.a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
class Practice_Set10 {
    public static void main(String[] args) {
        // Problem 1
//        circle2 objC = new circle2(12);
//        cylinder2 obj = new cylinder2(12,4);

//        System.out.println(objC.area());      // Problem 3
//        System.out.println(obj.volume());

        // Problem 2
//        Rectangle2 objR = new Rectangle2(12,4);
//        Cuboid obj = new Cuboid(12,4,5);

        // Problem 4

//        System.out.println(objR.area());
//        objR.setLength(12;
//        objR.setBreadth(4);
//        System.out.println(objR.getLength());
//        System.out.println(objR.getBreadth());

//        System.out.println(obj.volume())
//        obj.setA(5);
//        System.out.println(obj.getA());

    }
}
