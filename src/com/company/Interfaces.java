package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornBicycle{
    final int b = 45;
    public void blowHornK3g();
    void blowhornmhn();
}
class herculesCycle implements Bicycle, hornBicycle{
//    int a = 54;     --> No Error
    int speed = 7;
    public void blowHorn(){
        System.out.println("Blow Horn");
    }
    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Applying Brakes");
    }
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Applying speedUp");
    }
    @Override
    public void blowHornK3g(){
        System.out.println("Kabhi Kushi Kabhi gum");
    }
    @Override
    public void blowhornmhn(){
        System.out.println("Main hoon naa");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        herculesCycle cycleSrajan= new herculesCycle();
        cycleSrajan.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleSrajan.a);

        // You cannot modifies the properties in Interfaces as they are final
//        cycleSrajan.a = 454;    --> error
//        System.out.println(cycleSrajan.a);

        cycleSrajan.blowHornK3g();
        cycleSrajan.blowhornmhn();
    }
}
