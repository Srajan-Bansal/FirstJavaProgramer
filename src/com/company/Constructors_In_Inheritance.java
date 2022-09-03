package com.company;

class base1 {
    base1() {
        System.out.println("I am a Constructor");
    }
    base1(int x) {
        System.out.println("I am an overload Constructor with value x as: " + x);
    }
}

class derived1 extends base1{
    derived1(){
//        super(0);
        System.out.println("I am a derived1 class Constructor");
    }
    derived1(int x, int y){
//        super(x);
        System.out.println("I am an overload Constructor of derived1 with value y as: " + y);
    }
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am a childOfDerived class Constructor");
    }
    childOfDerived(int x, int y, int z){
//        super(x,y);
        System.out.println("I am an overload Constructor of derived1 with value z as: " + z);
    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
//        derived1 d = new derived1(14,9);
        childOfDerived cod = new childOfDerived();
    }
}
