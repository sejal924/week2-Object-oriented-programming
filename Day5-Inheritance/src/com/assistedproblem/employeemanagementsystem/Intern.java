package com.assistedproblem.employeemanagementsystem;

//subclass intern
class Intern extends Employee{
    Intern(String name, int id, double salary){
        super(name,id,salary);
    }
    //overriding method displayDetails
    public void displayDetails(){
        System.out.println("----The Intern Details:---- " );
        System.out.println("The intern name is: " + name);
        System.out.println("The id is: " + id);
        System.out.println("The salary is: " + salary);
    }
}
