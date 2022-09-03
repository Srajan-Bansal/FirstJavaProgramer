package com.company;

abstract class parent{
    int a = 45;
    public parent() {
        System.out.println("I am a Base2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}

class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
    @Override
    public void greet1(){
        System.out.println("Good Afternoon");
    }
}

abstract class child1 extends parent{
    public void th() {
        System.out.println("I am Good");
    }
}
public class Abstract {
    public static void main(String[] args) {
//        parent p = new parent();  --> error
//        child c = new child();
//        child1 c1 = new child1();  --> error

        parent p = new child();
        p.greet();
        p.greet1();
        p.sayHello();
    }
}