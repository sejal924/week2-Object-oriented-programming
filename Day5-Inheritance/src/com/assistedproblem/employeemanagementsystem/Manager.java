package com.assistedproblem.employeemanagementsystem;

//subclass Manager
class Manager extends Employee{
    protected int teamSize ;
    //constructor
    Manager(String name, int id, double salary,int teamSize){
        super(name,id, salary);
        this.teamSize = teamSize;
    }
    //overriding method displayDetails
    public void displayDetails(){
        System.out.println("----The Manager Details:---- " );
        System.out.println("The Manager name is: " + name);
        System.out.println("The id is: " + id);
        System.out.println("The salary is: " + salary);
        System.out.println("The size of the team is: " + teamSize);
    }
}
