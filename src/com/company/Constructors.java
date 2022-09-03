package com.company;

class myMainEmployee{
    private int id;
    private String name;
    private int income;

    public myMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public myMainEmployee(String myName , int myId){
        id = myId;
        name = myName;
    }
    public myMainEmployee(String myName){
        id = 2;
        name = myName;
    }

    public  void setName(String n) { this.name = n; }
    public String getName() { return name; }
    public void setId(int i) { this.id = i; }
    public int getId() { return id; }

    public  myMainEmployee(int salary) {
        income = salary;
    }
    public int getIncome(){
        return income;
    }
}

public class Constructors {
    public static void main(String[] args) {
//        myMainEmployee srajan = new myMainEmployee();
//        myMainEmployee srajan = new myMainEmployee("Srajan Bansal",42);
//        myMainEmployee srajan = new myMainEmployee("Srajan Bansal");
//        srajan.setName("Srajan Bansal");
//        srajan.setId(42);
//        System.out.println(srajan.getId());
//        System.out.println(srajan.getName());

        // Quick quiz
        myMainEmployee srajan = new myMainEmployee(10000);
        System.out.println(srajan.getIncome());

    }
}
