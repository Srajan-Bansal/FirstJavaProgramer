package com.company;

class phone{
    public void showTime(){
    System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class smartPhone extends phone{
    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        phone obj = new phone();    // Allowed

//        smartPhone smobj = new smartPhone();    // Allowed
//        obj.name();

        phone obj = new smartPhone();    // Yes! It is Allowed
//        smartPhone obj1 = new phone();  // Not Allowed

        obj.showTime();
        obj.on();
//        obj.music();   // Not Allowed
    }
}
