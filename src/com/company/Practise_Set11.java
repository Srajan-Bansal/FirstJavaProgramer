package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    @Override
    public void write() {
        System.out.println("Write");
    }
    @Override
    public void refill() {
        System.out.println("refill");
    }
    public void changeNib() {
        System.out.println("ChangeNib");
    }
}

class Monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("ring");
    }
    @Override
    void lift(){
        System.out.println("lift");
    }
    @Override
    void disconnect(){
        System.out.println("disconnect");
    }
}

interface TVRemote{
    void Volume();
    void Switch();
}
interface SmartTVRemote extends TVRemote{
    void mute();
    void changechannel();
}
class  TV implements SmartTVRemote{
    public void Volume(){
        System.out.println("Volume");
    }
    public void Switch(){
        System.out.println("witch");
    }
    public void mute(){
        System.out.println("mute(");
    }
    public void changechannel(){
        System.out.println("changechannel");
    }
}
public class Practise_Set11 {
    public static void main(String[] args) {
        // Problem 1+2
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

        // Problem 3
//        Human srajan = new Human();
//        srajan.eat();
//        srajan.sleep();
//        srajan.bite();
//        srajan.jump();

        // Problem 4
//        Telephone phone = new SmartTelephone();
//        phone.disconnect();
//        phone.lift();
//        phone.ring();

        // Problem 5
//        Monkey mon = new Human();
//        mon.jump();
//        mon.bite();
    }
}
