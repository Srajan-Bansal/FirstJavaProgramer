package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Custom_Class {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee srajan = new Employee();    // Instantiating a new Employee Object
        Employee john = new Employee();      // Instantiating a new Employee Object


        // Setting Attributes for Srajan
        srajan.id = 18;
        srajan.name = "Srajan Bansal";
        srajan.salary = 24000000;

        // Setting Attributes for John
        john.id = 13;
        john.name = "John Agarwal";
        john.salary = 2100000;

        // Printing the Attributes
        srajan.printDetails();
        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);

//        System.out.println(srajan.id);
//        System.out.println(srajan.name);
    }
}
