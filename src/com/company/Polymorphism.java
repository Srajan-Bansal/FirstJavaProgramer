package com.company;

interface MyCamera2 {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    @Override
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    @Override
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    //    @Override
//    public void record4KVideo(){
//        System.out.println("Taking Snap and recording in 4K");
//    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Srajan Bansal", "Tanisha Agarwal", "Harry"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> Not allowed Because methods can only be used of MyCamera2
        cam1.record4KVideo();

        MySmartPhone2 s =new MySmartPhone2();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(953661278);
    }
}
