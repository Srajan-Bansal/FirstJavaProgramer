package com.company;

class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a Constructor");
    }
}

class derived extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class animal{
    public String speak;
    public String getSpeak() {
        return speak;
    }
    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
class dog extends animal{
    public String bark;
    public String getBark() {
        return bark;
    }
    public void setBark(String bark) {
        this.bark = bark;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Creating a object of base class
//        base b =new base();
//        b.setX(4);
//        System.out.println(b.getX());

        // Creating an object of derived class
//        derived d = new derived();
//        d.setX(43);
//        d.setY(34);

//        System.out.println(d.getX());
//        System.out.println(d.getY());

        // Quick Quiz
        animal a = new animal();
        a.setSpeak("animal");
        System.out.println(a.getSpeak());

        dog d = new dog();
        d.setSpeak("animal");
        d.setBark("dog");

        System.out.println(d.getSpeak());
        System.out.println(d.getBark());
    }
}
