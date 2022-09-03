package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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
        String[] networkList = {"Srajan Bansal", "Tanisha Agarwal"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
    public class deafult_Methods{
        public static void main(String[] args) {
            MySmartPhone ms = new MySmartPhone();
            String[] arr = ms.getNetworks();
            for (String items: arr){
                System.out.println(items);
            }
            ms.record4KVideo();
            // ms.greet(); --> Throws an Error!
        }
    }

